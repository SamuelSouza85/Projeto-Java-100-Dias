package Dia065.Lambdas.Teste;

import Dia065.Lambdas.Dominio.Anime;
import Dia065.Lambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Reference to a static method
public class MethodReferenceTeste01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 100), new Anime(" Bunny girl Senpai", 14), new Anime("Naruto", 500)));
//        Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
