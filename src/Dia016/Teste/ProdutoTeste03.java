package Dia016.Teste;

import Dia016.Computador;
import Dia016.Produto;
import Dia016.Servico.CalculadoraImposto;
import Dia016.Tomate;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("25/05/2025");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
