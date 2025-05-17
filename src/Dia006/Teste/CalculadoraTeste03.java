package Dia006.Teste;

import Dia006.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisnumeros(20,0);
        System.out.println(result);
        System.out.println("---------------------------------");
        System.out.println(calculadora.divideDoisnumeros02(20, 0));
        System.out.println("---------------------------------");
       calculadora.imprimeDivisaoDeDoisnumeros(85, 0);
    }
}
