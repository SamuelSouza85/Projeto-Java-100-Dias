package Dia060.InnerClasses.Teste;

public class OuterClassesTeste02 {

    private String name = "Lemuas ed";

    void print(){
        String lastName = "Azuos";
        class LocalClass {
            public void printLocal(){
                System.out.println(name + " "+ lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTeste02 outer = new OuterClassesTeste02();
        outer.print();
    }
}
