public class PorcentagemSalarial {
    public static void main(String []args){
       float salario = 1500.50F;
       float porcentagem = 10;
       float porcentagemSalario = salario * (porcentagem/100);
       System.out.println("A porcentagem salarial de "+ porcentagem + "% sobre " + salario + " é de " + porcentagemSalario);
    }
}
