package Dia006.MetodosEParametros;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int numero1, int numero2) {
        System.out.println(numero1 * numero2);
    }

    public double divideDoisnumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            return 0;
        }
        return (int) (numero1 / numero2);
    }

    public double divideDoisnumeros02(double numero1, double numero2) {
        if (numero2 != 0) {
            return (int) (numero1 / numero2);
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisnumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(numero1 / numero2);
    }


    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 48;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }
}


