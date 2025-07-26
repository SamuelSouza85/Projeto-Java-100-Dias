package Dia077.Stream.Collectors.Teste;


import Dia076.Stream.Collectors.Dominio.Category;
import Dia076.Stream.Collectors.Dominio.LightNovel;
import Dia076.Stream.Collectors.Dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTeste02 {
    private static List<LightNovel> listLigthNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Re-Zero", 1.99, Category.FANTASY),
            new LightNovel("Bunny Girl Senpai", 1.99, Category.ROMANCE),
            new LightNovel("The Begginer After the End", 4.00, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = listLigthNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = listLigthNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        mapping(StreamTeste02::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = listLigthNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        mapping(StreamTeste02::getPromotion,
                                toCollection(LinkedHashSet::new))));

        System.out.println(collect2);

    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
