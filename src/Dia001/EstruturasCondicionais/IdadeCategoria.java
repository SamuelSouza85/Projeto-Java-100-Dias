package Dia001.EstruturasCondicionais;

import java.util.Scanner;

public class IdadeCategoria {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Qual é seu nome?");
        String nome = usuario.next();
        System.out.println("Quantos anos você tem?");
        int idade = usuario.nextInt();

        if(idade <= 10) {
            System.out.println(nome + " você participará do torneio infatil");
        }else if(idade >= 11 && idade <= 15) {
            System.out.println(nome + " você participará do torneio Juvenil");
        }else if (idade >= 16 && idade <= 19 ) {
            System.out.println(nome + " você participará do torneio Pré-Adulto");
        } else{
            System.out.println(nome + " você participará do torneio Adulto");
        }
    }
}
