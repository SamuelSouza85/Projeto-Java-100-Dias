package Dia021.String.Teste;

public class StringBuilderTeste {
    public static void main(String[] args) {
        String nome = "Samuel Souza";
        nome.concat(" Silva");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Samuel Souza");
        System.out.println(sb);
        sb.append(" Silva").append(" 08");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
    }
}
