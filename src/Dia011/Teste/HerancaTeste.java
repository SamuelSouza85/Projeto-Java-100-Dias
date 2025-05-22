package Dia011.Teste;

import Dia011.Endereco;
import Dia011.Funcionario;
import Dia011.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nagi");
        pessoa.setCpf("11111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("----------------------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Samuel");
        funcionario.setCpf("155263358");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(25000);
        funcionario.imprime();

    }
}
