package Dia070.Streams.Teste;

import Dia070.Streams.Dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTeste01 {
    private static List<LightNovel> listLigthNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Solo Leveling", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Re-Zero", 1.99),
            new LightNovel("The Begginer After the End", 4.00)
    ));
    public static void main(String[] args) {
        listLigthNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel listLigthNovel : listLigthNovels) {
            if (listLigthNovel.getPrice() <=4){
                titles.add(listLigthNovel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }

        System.out.println(listLigthNovels);
        System.out.println(titles);
    }


}
