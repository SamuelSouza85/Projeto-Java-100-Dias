package Dia006.Teste;

import Dia006.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero1 = 1;
        int numero2 = 2;
        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println("Dentro CalculadoraTeste04");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }
}
