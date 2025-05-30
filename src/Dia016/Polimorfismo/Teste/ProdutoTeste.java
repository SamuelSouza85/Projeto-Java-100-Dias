package Dia016.Polimorfismo.Teste;

import Dia016.Polimorfismo.Computador;
import Dia016.Polimorfismo.Televisao;
import Dia016.Polimorfismo.Tomate;
import Dia016.Polimorfismo.Servico.CalculadoraImposto;

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
