package Dia003;

import java.util.Scanner;

public class LoginAcesso {
    public static void main(String[] args) {
        final String login = "Jhon";
        final String password = "Baba";
        boolean exibirTelaLogin = true;
        Scanner usuario = new Scanner(System.in);
        while (exibirTelaLogin) {
            System.out.println("Digite seu login: ");
            String loginDigitado = usuario.nextLine();
            System.out.println("Digite sua senha: ");
            String passwordDigitado = usuario.nextLine();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)){
                System.out.println("Acesso Concedido");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("Acesso Negado");
        }
        System.out.println("Programa encerrado");
    }
}
