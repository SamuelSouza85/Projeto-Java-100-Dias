package Dia005.Objetos.Teste;

import Dia005.Objetos.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Robson";
        professor.idade = 40;
        professor.sexo = "Masculino";

        System.out.println("Nome:" +professor.nome+ "Idade:" + professor.idade+ "Sexo:" + professor.sexo);
    }
}
