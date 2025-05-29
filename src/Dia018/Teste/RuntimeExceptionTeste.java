package Dia018.Teste;

public class RuntimeExceptionTeste {
    public static void main(String[] args) {
        divisao(1, 0);
    }

    private static int divisao(int a, int b) throws  IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegall, não pode ser 0");
        }
        return a/b;
    }
}
