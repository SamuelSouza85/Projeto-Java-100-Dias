package Dia057.Generics.Wildcard.Teste;


import java.util.List;

public class WildcardTeste02 {

    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsuta(cachorros);
        printConsuta(gatos);


    }

    private static void printConsuta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }


    }
    private static void  printConsultaAnimal(List<? super Cachorro> animals){
       Animal animal1 = new Cachorro();
       Animal animal2 = new Gato();

    }
}
