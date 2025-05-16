package Dia002;

import java.util.Scanner;

public class AlistamentoObrigatorio {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Seu Gênero é Masculino ou Feminino?");
        String genero = usuario.next();
        System.out.println("Quantos anos você tem?");
        int idade = usuario.nextInt();
        if((genero.equalsIgnoreCase("Masculino") || genero.equalsIgnoreCase("Feminino")) && idade < 18){
            System.out.println("Você não pode se alistar, mas daqui a você poderá " + (18 - idade) + " a nos");

        } else if (genero.equalsIgnoreCase("Masculino") && idade >= 18) {
            System.out.println("Seu alistamento é obrigatório, você pode vir semana que vem se alistar");

        }else {
            System.out.println("Você tem vontade de se alistar?");
            String resposta = usuario.next();
            if (resposta.equalsIgnoreCase("Não")){
                System.out.println("Uma pena você não se alistar");
            }else if (resposta.equalsIgnoreCase("Sim")){
                System.out.println("Que ótima noticía daqui a uma semana você pode se alistar");
            }else{
                System.out.println("Responda com Sim ou Não");
            }
        }
    }
}
