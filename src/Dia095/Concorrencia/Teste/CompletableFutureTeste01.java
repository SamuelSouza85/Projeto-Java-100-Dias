package Dia095.Concorrencia.Teste;

import Dia095.Concorrencia.Service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTeste01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
      //  searchPricesSync(storeService);
      //  searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Strore 1"));
        System.out.println(storeService.getPriceSync("Strore 2"));
        System.out.println(storeService.getPriceSync("Strore 3"));
        System.out.println(storeService.getPriceSync("Strore 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d ms %n", (end-start));

    }

    private static void searchPricesAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAstncFuture("Strore 1");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAstncFuture("Strore 2");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAstncFuture("Strore 3");
        Future<Double> pricesAsyncFuture4 = storeService.getPricesAstncFuture("Strore 4");
        try {
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
            System.out.println(pricesAsyncFuture4.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d ms %n", (end-start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAstncCompletableFuture("Strore 1");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAstncCompletableFuture("Strore 2");
        CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAstncCompletableFuture("Strore 3");
        CompletableFuture<Double> pricesAsyncFuture4 = storeService.getPricesAstncCompletableFuture("Strore 4");
            System.out.println(pricesAsyncFuture1.join());
            System.out.println(pricesAsyncFuture2.join());
            System.out.println(pricesAsyncFuture3.join());
            System.out.println(pricesAsyncFuture4.join());
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d ms %n", (end-start));

    }
}
