package Dia021.String.Teste;

public class StringTeste {
    public static void main(String[] args) {
        String nome = "Samuel"; //String constant pool
        String nome2 = "Samuel";
        nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Samuel");// 1 variavel de referêcia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
