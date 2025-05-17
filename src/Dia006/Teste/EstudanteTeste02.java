package Dia006.Teste;

import Dia006.Estudante;
import Dia006.ImprimeEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Roberto Carlos";
        estudante01.sexo = "M";
        estudante01.idade = 1000;

        estudante02.nome = "Kaguya";
        estudante02.sexo = "F";
        estudante02.idade = 1000;

         estudante01.imprime();
         estudante02.imprime();
    }
}
