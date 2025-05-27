package Dia016.Teste;

import Dia016.Computador;
import Dia016.Servico.CalculadoraImposto;
import Dia016.Televisao;
import Dia016.Tomate;

public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate tomatudo", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
