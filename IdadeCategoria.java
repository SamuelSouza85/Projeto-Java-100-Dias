public class IdadeCategoria {
    public static void main(String[] args) {
        String nome = "Samuel";
        int idade = 15;

        if(idade <= 10) {
            System.out.println(nome + " você participará do torneio infatil");
        }else if(idade >= 11 && idade <= 15) {
            System.out.println(nome + " você participará do torneio Juvenil");
        }else if (idade >= 16 && idade <= 19 ) {
            System.out.println(nome + " você participará do torneio Pré-Adulto");
        } else{
            System.out.println(nome + " você participará do torneio Adulto");
        }
    }
}
