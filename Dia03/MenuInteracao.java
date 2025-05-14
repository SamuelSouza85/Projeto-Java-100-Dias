import java.util.Scanner;

public class MenuInteracao {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 3){
                System.out.println("1.Calcular imposto");
                System.out.println("2.Depositar sálario");
                System.out.println("3.Sair");
                System.out.println("Digite sua opção:");
                opcao = usuario.nextInt();
        }
    }
}
