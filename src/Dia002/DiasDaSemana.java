package Dia002;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7:");
        int numeroDosDias = usuario.nextInt();
        if (numeroDosDias == 1){
            System.out.println("segunda-feria");
        }else if (numeroDosDias == 2) {
            System.out.println("terça-feria");
        }else if (numeroDosDias == 3) {
            System.out.println("quarta-feria");
        }else if (numeroDosDias == 4) {
            System.out.println("quinta-feria");
        }else if (numeroDosDias == 5) {
            System.out.println("sexta-feria");
        }else if (numeroDosDias == 6) {
            System.out.println("sábado");
        }else if (numeroDosDias == 7) {
            System.out.println("domingo");
        }else{
            System.out.println("Dia inválido, digite apenas números de 1 a 7");
        }
    }
}
