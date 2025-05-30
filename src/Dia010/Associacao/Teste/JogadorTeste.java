package Dia010.Associacao.Teste;

import Dia010.Associacao.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Jogador jogador03 = new Jogador("Ronaldo");
        Jogador [] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprimi();
        }

    }

}
