package Dia008.ModificadorPrivate.Teste;

import Dia008.ModificadorPrivate.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Japa");
        pessoa.setIdade(80);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
