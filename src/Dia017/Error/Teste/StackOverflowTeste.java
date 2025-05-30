package Dia017.Error.Teste;

public class StackOverflowTeste {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
