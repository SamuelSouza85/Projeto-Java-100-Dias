package Dia010.Teste;

import Dia010.Jogador;
import Dia010.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Péle");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprimi();
    }
}
