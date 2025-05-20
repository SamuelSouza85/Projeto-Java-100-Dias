package Dia009.Teste;

import Dia009.Manga;

public class MangaTeste {
    public static void main(String[] args) {
        Manga manga = new Manga("Solo Leveling");

        for (int capitulo : manga.getCapitulos()) {
            System.out.print(manga + " ");
        }


    }
}
