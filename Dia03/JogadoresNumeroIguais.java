import java.util.Scanner;

public class JogadoresNumeroIguais {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner usuario = new Scanner(System.in);
        do {
            System.out.println("Player 1: Digite um numero de 1 a 10:");
            int player1 = usuario.nextInt();
            System.out.println("Player 2: Digite um numero de 1 a 10:");
            int player2 = usuario.nextInt();
            if (player1 == player2){
                System.out.println("Muito bom foi um acerto");
            }else{
                System.out.println("Vocês erraram precisam treinar o trabalho em equipe");
            }
            System.out.println("-------------------------------------------------");
            System.out.println("Deseja continuar jogando");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            desejaContinuar = usuario.nextInt();
        }while (desejaContinuar == 1);
    }
}
