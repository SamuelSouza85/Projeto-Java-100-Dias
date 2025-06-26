package Dia047.Colecoes.BinarySearch.Teste;

import Dia046.Colecoes.SortingList.Dominio.Manga;
import Dia046.Colecoes.SortingList.Teste.MangaByIdComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Berserk", 19.99));
        mangas.add(new Manga(2L, "Dinossauro Rei", 28.10));
        mangas.add(new Manga(3L, "Pokemon", 15.00));
        mangas.add(new Manga(4L, "One Piece", 50.00));
        mangas.add(new Manga(1L, "Naruto", 25.00));

        //Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-------------");

        Manga mangaToSearch = new Manga(4L, "One Piece", 50.00);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator ));

    }
}
