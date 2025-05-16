package Dia002;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite seu nome de usuário:");
        String nome = usuario.next();
        if (nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador") || nome.equals("") || nome.equals(null)) {
            System.out.println("Usuário inválido");
        }
        else{
            System.out.println(nome + " cadrastrado com sucesso");
        }
    }
}
