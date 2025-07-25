package Dia076.Stream.Collectors.Teste;


import Dia076.Stream.Collectors.Dominio.Category;
import Dia076.Stream.Collectors.Dominio.LightNovel;
import Dia076.Stream.Collectors.Dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        Map<Promotion, List<LightNovel>> collect = listLigthNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));

        System.out.println(collect);

        System.out.println("----------------");

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = listLigthNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                )));

        System.out.println(collect1);
    }
}
