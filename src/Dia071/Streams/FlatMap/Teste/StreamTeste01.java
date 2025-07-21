package Dia071.Streams.FlatMap.Teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTeste01 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Samuel", "Cleber", "Gustavo", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }

        }

        System.out.println("-----------");

        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
