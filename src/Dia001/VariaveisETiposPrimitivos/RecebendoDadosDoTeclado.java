package Dia001.VariaveisETiposPrimitivos;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = teclado.next();
        System.out.println("Quantos anos você tem:");
        int idade = teclado.nextInt();
        System.out.println("Tudo bem com você? " + nome );
        System.out.println("Você tem " + idade + " anos" );
    }
}
