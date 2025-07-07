package Dia058.Generics.GenericClass.Teste;

import Dia058.Generics.GenericClass.Dominio.Carro;
import Dia058.Generics.GenericClass.Service.CarroRentavelService;

public class GenericClassTeste01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarrosDisponível();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
