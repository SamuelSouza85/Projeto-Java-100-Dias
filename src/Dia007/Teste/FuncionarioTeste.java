package Dia007.Teste;


import Dia007.Funcionario;
import Dia007.ImpressoraFuncionario;

import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImpressoraFuncionario impressora = new ImpressoraFuncionario();
        Scanner usuario = new Scanner(System.in);


        impressora.imprime(funcionario);
    }


}
