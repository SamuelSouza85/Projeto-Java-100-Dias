package Dia101.Concorrencia.Teste;

import Dia101.Concorrencia.Domino.Country;
import Dia101.Concorrencia.Domino.Currency;
import Dia101.Concorrencia.Domino.CurrencyFactory;

public class CurrencyFactoryTeste01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSyboml());

    }
}
