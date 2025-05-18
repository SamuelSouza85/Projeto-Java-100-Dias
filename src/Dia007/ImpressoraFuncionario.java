package Dia007;

import java.util.Scanner;

public class ImpressoraFuncionario {
    public void imprime(Funcionario funcionario){
        Scanner usuario = new Scanner(System.in);

        System.out.println("Qual seu nome:");
        funcionario.nome = usuario.next();
        System.out.println("Qual sua idade: ");
        funcionario.idade = usuario.nextInt();

        for (int i = 0; i < funcionario.salario.length; i++) {
            System.out.println("Digite o salário " + (i + 1) + " :");
            funcionario.salario[i] = usuario.nextDouble();
        }

        System.out.println("Dados do funcionário");
        System.out.println("-----------------------------");
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        funcionario.media = 0;

        for (int i = 0; i < funcionario.salario.length; i++) {
            funcionario.media += funcionario.salario[i];
            System.out.println("Salário" + (i+ 1) + ": " + funcionario.salario[i]);
        }

        funcionario.media = funcionario.media/ funcionario.salario.length;
        System.out.println("-----------------------------");
        System.out.println("Média dos salários: " + funcionario.media);

    }
}
