package Dia073.Stream.Reduce.Teste;

import Dia070.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTeste02 {
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
        listLigthNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        System.out.println("--------------");

        double sum = listLigthNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);

    }
}
