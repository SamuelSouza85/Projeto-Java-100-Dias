import java.util.Scanner;

public class DiasDaSemanaMelhorado {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7:");
        int numeroDosDias = usuario.nextInt();
        switch (numeroDosDias) {
            case 1:
                System.out.println("segunda-feira");
                break;
            case  2:
                System.out.println("terça-feira");
                break;
            case  3:
                System.out.println("quarta-feira");
                break;
            case  4:
                System.out.println("quinta-feira");
                break;
            case  5:
                System.out.println("sexta-feira");
                break;
            case  6:
                System.out.println("sábado");
                break;
            case  7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("Dia inválido, digite apenas números de 1 a 7");
                break;
        }
    }
}
