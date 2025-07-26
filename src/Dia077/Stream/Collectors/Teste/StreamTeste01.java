package Dia077.Stream.Collectors.Teste;


import Dia076.Stream.Collectors.Dominio.Category;
import Dia076.Stream.Collectors.Dominio.LightNovel;
import Dia076.Stream.Collectors.Dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTeste01 {
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
        Map<Category, Long> collect = listLigthNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = listLigthNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = listLigthNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collect2);
    }
}
