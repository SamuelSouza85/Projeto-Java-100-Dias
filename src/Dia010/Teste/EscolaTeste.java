package Dia010.Teste;

import Dia010.Escola;
import Dia010.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Robinho");
        Professor professor02 = new Professor("Priscila");
        Professor[] professores = {professor01, professor02};
        Escola escola = new Escola("Pró-Conhecer", professores);

        escola.imprime();
    }
}
