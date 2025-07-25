package Dia076.Stream.Collectors.Teste;


import Dia076.Stream.Collectors.Dominio.Category;
import Dia076.Stream.Collectors.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
/*        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for (LightNovel listLigthNovel : listLigthNovels) {
            switch (listLigthNovel.getCategory()){
                case DRAMA: drama.add(listLigthNovel); break;
                case FANTASY: fantasy.add(listLigthNovel); break;
                case ROMANCE: romance.add(listLigthNovel); break;
            }
        }
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.ROMANCE, romance);
        System.out.println(categoryListMap); */


        Map<Category, List<LightNovel>> collect = listLigthNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
