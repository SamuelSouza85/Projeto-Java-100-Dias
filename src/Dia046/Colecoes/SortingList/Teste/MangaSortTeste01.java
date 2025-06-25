package Dia046.Colecoes.SortingList.Teste;

import Dia046.Colecoes.SortingList.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Berserk", 19.99));
        mangas.add(new Manga(2L, "Dinossauro Rei", 28.10));
        mangas.add(new Manga(3L, "Pokemon", 15.00));
        mangas.add(new Manga(4L, "One Piece", 50.00));
        mangas.add(new Manga(1L, "Naruto", 25.00));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        mangas.sort(new MangaByIdComparator());
        System.out.println("------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
