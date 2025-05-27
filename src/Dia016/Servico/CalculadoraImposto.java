package Dia016.Servico;

import Dia016.Computador;
import Dia016.Produto;
import Dia016.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto:" + produto.getNome());
        System.out.println("Preço:" + produto.getValor());
        System.out.println("Produto:" + imposto);
        if (produto instanceof  Tomate){
            System.out.println("Data de validade:" + ((Tomate) produto).getDataValidade());
            System.out.println("-------------------------------");
        }

    }
}
