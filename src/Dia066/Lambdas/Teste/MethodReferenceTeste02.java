package Dia066.Lambdas.Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;


public class MethodReferenceTeste02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Souza", "Alberto", "Jorge", "Lucas"));
        list.sort(String::compareTo);
        System.out.println(list);

        System.out.println("---------------");

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        System.out.println("---------------");

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Souza"));
    }
}
