package Dia003.LacosDeRepeticao0;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite um número impár desejado:");
        int numeroDesejado = usuario.nextInt();
        int i = 0;
        while(i <= numeroDesejado){
            if(i % 2 == 1){
                System.out.println("1 = "+ i);
            }
            i = i + 1;
        }
    }
}
