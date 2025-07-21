package Dia072.Stream.Teste;

import Dia070.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        System.out.println(listLigthNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(listLigthNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(listLigthNovels.stream().noneMatch(ln -> ln.getPrice() < 0 ));
        listLigthNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        listLigthNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        listLigthNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice).reversed())
                .ifPresent(System.out::println);
    }

}
