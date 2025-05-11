public class ImpostoRenda {
    public static void main(String[] args) {
        double salario = 3550D;
        if(salario <= 1903.98){
            System.out.println("Isento");
        }else if(salario >= 1903.99 && salario <= 2826.65){
            System.out.println("Você deverá pagar 7.5% do seu salário o que equivale a R$" + (7.5/100 * salario));
        }else if(salario >= 2826.65 && salario <= 3751.05){
            System.out.println("Você deverá pagar 15% do seu salário o que equivale a R$" + (15.0/100 * salario));
        }else if(salario >= 3751.05 && salario <= 4667.68){
            System.out.println("Você deverá pagar 22.5% do seu salário o que equivale a R$" + (22.5/100 * salario));
        }else{
            System.out.println("Você deverá pagar 27.5% do seu salário o que equivale a R$" + (27.5/100 * salario));
        }
    }
}
