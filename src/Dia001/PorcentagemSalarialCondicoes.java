package Dia001;

public class PorcentagemSalarialCondicoes {
    public static void main(String[] args) {
        float salario = 4548F;
        float resultado = 0F;

        if(salario >= 4500F){
            resultado = 30/100F * salario;
            System.out.println("Por seu salário de R$" + salario +  ", por ser maior ou igual do que R$4500 a " +
                    "porcentagem considerada séra de 30%, logo ficará no valor de R$" + resultado);
        }
        else{
            resultado = 15/100F * salario;
            System.out.println("Por seu salário de R$" + salario +  ", por ser menor do que R$4500 a porcentagem " +
                    "considerada séra de 15%, logo ficará no valor de R$" + resultado);
        }
    }
}
