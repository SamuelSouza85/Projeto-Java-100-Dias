package Dia075.Stream.Collectors.Teste;

import Dia070.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste01 {
    private static List<LightNovel> listLigthNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Solo Leveling", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Re-Zero", 1.99),
            new LightNovel("Re-Zero", 1.99),
            new LightNovel("The Begginer After the End", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(listLigthNovels.stream().count());
        System.out.println(listLigthNovels.stream().collect(Collectors.counting()));

        System.out.println("----------");

        listLigthNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        listLigthNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println("----------");

        System.out.println(listLigthNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(listLigthNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        System.out.println("----------");

        listLigthNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(listLigthNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        System.out.println("----------");

        DoubleSummaryStatistics collect = listLigthNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = listLigthNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);


    }
}
