package Dia009.BlocoDeInicialização.Teste;

import Dia009.BlocoDeInicialização.Manga;

public class MangaTeste {
    public static void main(String[] args) {
        Manga manga = new Manga("Solo Leveling");

        for (int capitulo : manga.getCapitulos()) {
            System.out.print(manga + " ");
        }


    }
}
