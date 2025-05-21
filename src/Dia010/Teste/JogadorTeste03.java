package Dia010.Teste;

import Dia010.Jogador;
import Dia010.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador01, jogador02};

        jogador01.setTime(time);
        jogador02.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---Jogador---");

        jogador01.imprimi();
        System.out.println("---Jogador---");

        jogador02.imprimi();

        System.out.println("---Time---");

        time.imprime();

    }
}
