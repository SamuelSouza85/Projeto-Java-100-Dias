package Dia066.Lambdas.Teste;

import Dia065.Lambdas.Dominio.Anime;
import Dia066.Lambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;


public class MethodReferenceTeste01 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 100), new Anime(" Bunny girl Senpai", 14), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
