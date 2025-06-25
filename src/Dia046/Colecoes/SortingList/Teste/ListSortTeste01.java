package Dia046.Colecoes.SortingList.Teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        System.out.println("Mangas");
        System.out.println("------------------");

        mangas.add("One Piece");
        mangas.add("Blue Lock");
        mangas.add("Berserk");
        mangas.add("Naruto");
        mangas.add("Pokemon");
        mangas.add("Dinossauro Rei");

        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------");
        System.out.println("Dinheiro");
        System.out.println("------------------");



        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(21.21);
        dinheiros.add(28.25);
        dinheiros.add(1749.58);
        dinheiros.add(30.54);

        Collections.sort(dinheiros);

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }
        System.out.println("------------------");
    }
}
