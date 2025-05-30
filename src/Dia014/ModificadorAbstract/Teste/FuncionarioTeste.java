package Dia014.ModificadorAbstract.Teste;

import Dia014.ModificadorAbstract.Desenvolvedor;
import Dia014.ModificadorAbstract.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
