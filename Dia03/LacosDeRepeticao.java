import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Escolha um numéro em que deseja que o contador chegue: ");
        int numeroPedido = usuario.nextInt();
        System.out.println("O contador aumetará de quanto em quanto:");
        int numeroAumentado = usuario.nextInt();
        int contador = 0;
        while (contador < numeroPedido){
            contador = contador + numeroAumentado;
            System.out.println("Contador: " + (contador));
        }
    }
}