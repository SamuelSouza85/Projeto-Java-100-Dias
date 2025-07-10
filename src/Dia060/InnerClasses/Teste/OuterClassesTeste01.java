package Dia060.InnerClasses.Teste;

public class OuterClassesTeste01 {

    private String name = "Samuel de Souza";
    // Nested
    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTeste01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTeste01 outerClasses = new OuterClassesTeste01();
        Inner inner = outerClasses.new Inner();
        Inner inner2 = new OuterClassesTeste01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
