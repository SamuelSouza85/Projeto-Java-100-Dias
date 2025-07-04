package Dia054.Colecoes.Teste;

import Dia046.Colecoes.SortingList.Dominio.Manga;
import Dia054.Colecoes.Dominio.Consumidor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Samuel");
        Consumidor consumidor2 = new Consumidor("Cleber");


        Manga manga1 = new Manga(5L, "Berserk", 19.99);
        Manga manga2 = new Manga(2L, "Dinossauro Rei", 28.10);
        Manga manga3 = new Manga(3L, "Pokemon", 15.00);
        Manga manga4 = new Manga(4L, "One Piece", 50.00);
        Manga manga5 = new Manga(1L, "Naruto", 25.00);

        List<Manga> mangaConsumifor1List = List.of(manga1, manga4, manga2);
        List<Manga> mangaConsumifor2List = List.of(manga1, manga5, manga3);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor1, mangaConsumifor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumifor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("--" +entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("--" + manga.getNome());
            }

        }



    }
}
