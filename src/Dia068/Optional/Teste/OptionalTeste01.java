package Dia068.Optional.Teste;

import javax.xml.transform.Source;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTeste01 {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("DevDojo melhor canal de Java do Brasil");
        Optional<String> op2 = Optional.ofNullable(null);
        Optional<String> op3 = Optional.empty();

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);

        System.out.println("----------");

        Optional<String> nameOptional = findName("samuel");
        String empty = nameOptional.orElse("EMPTY");

        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }


    private static Optional<String> findName (String name) {
        List<String> list = List.of("Samuel", "Souza");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
