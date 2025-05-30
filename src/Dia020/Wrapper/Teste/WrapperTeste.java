package Dia020.Wrapper.Teste;

public class WrapperTeste {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        boolean booleanP = false;
        char charP = 'M';

        Byte byteW = 1; //autoboxing
        Short shortW = 1; //autoboxing
        Integer intW = 1; //autoboxing
        Long longW = 10L; //autoboxing
        Float floatW = 10F; //autoboxing
        Double doubleW = 10D; //autoboxing
        Boolean booleanW = false; //autoboxing
        Character charW = 'M'; //autoboxing

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("True");
        System.out.println(verdadeiro);


        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('a'));


    }
}
