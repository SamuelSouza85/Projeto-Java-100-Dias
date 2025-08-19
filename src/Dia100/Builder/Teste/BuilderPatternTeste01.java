package Dia100.Builder.Teste;

import Dia100.Builder.Dominio.Person;

public class BuilderPatternTeste01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .username("viradonojiriya")
                .email("william.suane@devdojo.academy")
                .build();
        System.out.println(build);
    }
}
