package Dia012.HerancaEModificadorFinal.Teste;

import Dia012.HerancaEModificadorFinal.Carro;
import Dia012.HerancaEModificadorFinal.Comprador;
import Dia012.HerancaEModificadorFinal.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
