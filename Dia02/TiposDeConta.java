import java.util.Scanner;

public class TiposDeConta {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("A sua conta é conta_corrente, conta_poupança ou conta_investimento");
        String conta = usuario.next();
        switch (conta){
            case "conta_poupança":
                System.out.println("A sua conta proporciona 0.05% de juros");
                break;
            case "conta_corrente":
                System.out.println("A sua conta proporciona 0.02% de juros");
                break;
            case "conta_investimento":
                System.out.println("A sua conta proporciona 0.1% de juros");
                break;
            default:
                System.out.println("conta inexistente, escreva apenas uma conta entre essas três");
                break;
        }
    }
}
