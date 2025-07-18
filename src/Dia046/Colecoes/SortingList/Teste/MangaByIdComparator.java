package Dia046.Colecoes.SortingList.Teste;

import Dia046.Colecoes.SortingList.Dominio.Manga;

import java.util.Comparator;

public class  MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
