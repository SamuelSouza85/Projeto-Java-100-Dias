package Dia019.ExceptionCustomizada.Teste;

import Dia019.ExceptionCustomizada.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTeste {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usuarioDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario:");
        String usuario = teclado.next();
        System.out.println("Senha:");
        String senha = teclado.next();

        if (!usuario.equals(usuarioDB) || !senha.equals(senhaDB)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("---------------X---------------");
        System.out.println("Usuário logado com sucesso");
    }
}
