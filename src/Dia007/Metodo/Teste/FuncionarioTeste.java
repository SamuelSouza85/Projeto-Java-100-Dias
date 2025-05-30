package Dia007.Metodo.Teste;


import Dia007.Metodo.Funcionario;
import Dia007.Metodo.ImpressoraFuncionario;

import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImpressoraFuncionario impressora = new ImpressoraFuncionario();
        Scanner usuario = new Scanner(System.in);


        impressora.imprime(funcionario);
    }


}
