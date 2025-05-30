package Dia010.Associacao.Teste;

import Dia010.Associacao.Escola;
import Dia010.Associacao.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Robinho");
        Professor professor02 = new Professor("Priscila");
        Professor[] professores = {professor01, professor02};
        Escola escola = new Escola("Pró-Conhecer", professores);

        escola.imprime();
    }
}
