package Dia062.InnerClass.Teste;

public class OuterClassTeste01 {
    private String name = "Samuel";
    static class Nested{
        void print(){
            System.out.println(new OuterClassTeste01().name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
