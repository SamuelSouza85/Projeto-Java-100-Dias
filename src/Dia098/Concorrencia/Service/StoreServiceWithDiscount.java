package Dia098.Concorrencia.Service;

import Dia098.Concorrencia.Domino.Discount;
import Dia098.Concorrencia.Domino.Quote;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public String getPriceSync(String storeName) {
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()
                [ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
                ];
        return String.format(Locale.US,"%s: %.2f: %s", storeName, price, discountCode);

    }

    public String applyDiscount(Quote quote){
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discouny code '%s'. Final price: '%.2f",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discountValue);
    }

    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
