package Dia045.Colecoes.Teste;

import Dia045.Colecoes.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Dia045.Colecoes.Dominio.Smartphone s1 = new Dia045.Colecoes.Dominio.Smartphone("1ABC1", "iPhone");
        Dia045.Colecoes.Dominio.Smartphone s2 = new Dia045.Colecoes.Dominio.Smartphone("22222", "Pixel");
        Dia045.Colecoes.Dominio.Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Dia045.Colecoes.Dominio.Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        Dia045.Colecoes.Dominio.Smartphone s4 = new Dia045.Colecoes.Dominio.Smartphone("22222", "Pixel");

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);
    }
}
