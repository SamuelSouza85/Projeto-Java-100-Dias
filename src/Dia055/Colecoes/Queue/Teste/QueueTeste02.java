package Dia055.Colecoes.Queue.Teste;

import Dia049.Colecoes.Dominio.Manga;
import Dia052.Colecoes.Teste.MangaPrecoComparatorImpl;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparatorImpl().reversed());
        mangas.add(new Manga(5L, "Berserk", 19.99, 0));
        mangas.add(new Manga(2L, "Dinossauro Rei", 28.10, 2));
        mangas.add(new Manga(3L, "Pokemon", 15.00, 1));
        mangas.add(new Manga(4L, "One Piece", 50.00, 0));
        mangas.add(new Manga(1L, "Naruto", 25.00, 5));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
