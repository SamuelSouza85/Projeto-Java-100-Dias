package Dia003;

public class DoWhile {
    public static void main(String[] args) {
        boolean condicao = false;
        while (condicao){
            System.out.println("dentro do while");
        }
        do {
            System.out.println("dentro do do-while");
        }while(condicao);
    }
}
