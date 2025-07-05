package Dia052.Colecoes.Teste;

import Dia045.Colecoes.Dominio.Smartphone;
import Dia049.Colecoes.Dominio.Manga;

import java.util.*;

class  SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return  o1.getMarca().compareTo(o2.getMarca());
    }
}



public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);


        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparatorImpl());
        mangas.add(new Manga(5L, "Berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Dinossauro Rei", 28.10, 2));
        mangas.add(new Manga(3L, "Pokemon", 15.00, 1));
        mangas.add(new Manga(4L, "One Piece", 50.00, 0));
        mangas.add(new Manga(1L, "Naruto", 25.00, 5));
        mangas.add(new Manga(10L, "Arragon", 35.00, 5));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------");

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 30, 5);

        //lower <
        //floor <=
        // higher >
        // ceiling >=


        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}
