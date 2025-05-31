package Dia021.String.Teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "    Jotaro";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 2));
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim());
    }
}
