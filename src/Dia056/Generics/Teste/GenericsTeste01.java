package Dia056.Generics.Teste;

import Dia054.Colecoes.Dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {
        // Type erause
        List lista = new ArrayList();
        lista.add("Midoriya");
        lista.add(123L);
        lista.add(new Consumidor("Goku"));

        for (Object o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Midoriya"));
    }

    private static void add (List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
