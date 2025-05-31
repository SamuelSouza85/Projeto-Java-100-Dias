package Dia021.String.Teste;

public class StringBuilderTeste {
    public static void main(String[] args) {
        String nome = "Samuel Souza";
        nome.concat(" Silva");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Samuel Souza");
        sb.append(" Silva").append(" 08");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
