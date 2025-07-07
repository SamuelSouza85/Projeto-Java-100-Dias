package Dia058.Generics.GenericClass.Teste;

import Dia058.Generics.GenericClass.Dominio.Barco;
import Dia058.Generics.GenericClass.Dominio.Carro;
import Dia058.Generics.GenericClass.Service.CarroRentavelService;
import Dia058.Generics.GenericClass.Service.RentalService;

import java.util.ArrayList;
import java.util.List;


public class GenericClassTeste03 {
    public static void main(String[] args) {
        List<Barco> barcosDiponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

        List<Carro> carrosDiponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDiponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponível();
        System.out.println("Usando carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("--------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDiponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponível();
        System.out.println("Usando carro por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
