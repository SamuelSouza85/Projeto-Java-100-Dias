package Dia004.Array;

import java.util.Scanner;

public class NotasArrayFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner usuario = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + " :");
            notas[i] = usuario.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Nota" + (i+ 1) + " : " + notas[i]);
        }
        media = media / notas.length;
        System.out.println("Media das notas: " + media);
    }
}
