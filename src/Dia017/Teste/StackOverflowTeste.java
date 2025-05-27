package Dia017.Teste;

public class StackOverflowTeste {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
