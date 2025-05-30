package Dia016.Polimorfismo.Teste;

import Dia016.Polimorfismo.Computador;
import Dia016.Polimorfismo.Produto;
import Dia016.Polimorfismo.Tomate;
import Dia016.Polimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("25/05/2025");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
