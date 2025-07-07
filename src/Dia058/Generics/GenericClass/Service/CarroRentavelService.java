package Dia058.Generics.GenericClass.Service;

import Dia058.Generics.GenericClass.Dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDiponiveis = new ArrayList<>
            (List.of(new Carro("BMW"), new Carro("Mercedes")));

    public Carro buscarCarrosDisponível(){
        System.out.println("Buscando carro disponível......");
        Carro carro = carrosDiponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDiponiveis);
        return  carro;
    }
    public  void  retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo " +carro);
        carrosDiponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDiponiveis);
    }
}
