package Dia003.LacosDeRepeticao0;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite o numero desejado:");
        int numeroTabuada = usuario.nextInt();
        for (int i = 1; i <= numeroTabuada * 1 ; i++) {
            System.out.println((numeroTabuada * i) );
        }
    }
}
