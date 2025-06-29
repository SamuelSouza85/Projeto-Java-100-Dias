package Dia049.Colecoes.Teste;

import Dia049.Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteretorTeste01 {
    public static void main(String[] args) {

        List<Dia049.Colecoes.Dominio.Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 19.99, 0));
        mangas.add(new Manga(2L, "Dinossauro Rei", 28.10, 2));
        mangas.add(new Manga(3L, "Pokemon", 15.00, 1));
        mangas.add(new Manga(4L, "One Piece", 50.00, 0));
        mangas.add(new Manga(1L, "Naruto", 25.00, 5));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuatidade() == 0){
//                mangaIterator.remove();
//            }
//        }


        mangas.removeIf(manga -> manga.getQuatidade() == 0);

        System.out.println(mangas);
    }
}
