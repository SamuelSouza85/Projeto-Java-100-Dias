package Dia005.Teste;

import Dia005.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Samuel";
        estudante.idade = 16;
        estudante.sexo = "M";

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante);
    }
}
