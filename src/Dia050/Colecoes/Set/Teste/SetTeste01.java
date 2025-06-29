package Dia050.Colecoes.Set.Teste;

import Dia049.Colecoes.Dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Berserk", 19.99, 0));
        mangas.add(new Manga(2L, "Dinossauro Rei", 28.10, 2));
        mangas.add(new Manga(3L, "Pokemon", 15.00, 1));
        mangas.add(new Manga(4L, "One Piece", 50.00, 0));
        mangas.add(new Manga(1L, "Naruto", 25.00, 5));
        mangas.add(new Manga(1L, "Naruto", 25.00, 5));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
