import java.util.Scanner;

public class MultiplicaçãoDoisVetores {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        int[ ] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o numero " + (i + 1) + " do primeiro vetor:");
            vetor1[i] = usuario.nextInt();
            System.out.println("Digite o numero " + (i + 1) + " do segundo vetor:");
            vetor2[i] = usuario.nextInt();
            System.out.println("O resultado da multiplicação: " + (vetor1[i] * vetor2[i]));
        }
    }
}
