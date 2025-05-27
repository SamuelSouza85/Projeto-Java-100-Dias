package Dia016.Teste;

import Dia016.Repositorio.Repositorio;
import Dia016.Servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Frezza");
        list.add("Vegeta");
        list.add("Goku");
    }
}
