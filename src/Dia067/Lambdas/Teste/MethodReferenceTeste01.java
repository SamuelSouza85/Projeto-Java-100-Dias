package Dia067.Lambdas.Teste;

import Dia065.Lambdas.Dominio.Anime;
import Dia066.Lambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTeste01 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeAcomparators = AnimeComparators::new;
            AnimeComparators animeComparators = newAnimeAcomparators.get();
            List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 100), new Anime(" Bunny girl Senpai", 14), new Anime("Naruto", 500)));

            animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Berserk", 50));
    }
}
