package Dia007.Metodo.Teste;

import Dia007.Metodo.Calculadora;

public class CalculadoraTeste{
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
