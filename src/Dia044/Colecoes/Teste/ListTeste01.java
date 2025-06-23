package Dia044.Colecoes.Teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList(16);
        List <String> nomes2 = new ArrayList(16);
        nomes.add("William");
        nomes.add("DevDojo");
        nomes2.add("Suane");
        nomes2.add("Loucura");

        nomes.addAll(nomes2);
        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("----------------");

        int size = nomes.size();
        for (int i =0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
