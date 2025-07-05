package Dia052.Colecoes.Teste;

import Dia049.Colecoes.Dominio.Manga;

import java.util.Comparator;

public class MangaPrecoComparatorImpl implements Comparator<Manga> {
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

