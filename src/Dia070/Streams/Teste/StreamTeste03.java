package Dia070.Streams.Teste;

import Dia070.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste03 {
    private static List<LightNovel> listLigthNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Solo Leveling", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Re-Zero", 1.99),
            new LightNovel("Re-Zero", 1.99),
            new LightNovel("The Begginer After the End", 4.00)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = listLigthNovels.stream();

        listLigthNovels.forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);

    }
}
