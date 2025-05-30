package Dia006.MetodosEParametros.Teste;

import Dia006.MetodosEParametros.Estudante;
import Dia006.MetodosEParametros.ImprimeEstudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "Roberto Carlos";
        estudante01.sexo = "M";
        estudante01.idade = 1000;

        estudante02.nome = "Kaguya";
        estudante02.sexo = "F";
        estudante02.idade = 1000;

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

    }
}
