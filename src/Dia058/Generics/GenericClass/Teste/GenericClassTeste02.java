package Dia058.Generics.GenericClass.Teste;

import Dia058.Generics.GenericClass.Dominio.Barco;
import Dia058.Generics.GenericClass.Service.BarcoRentavelService;


public class GenericClassTeste02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barcos = barcoRentavelService.buscarBarcosDisponível();
        System.out.println("Usando carro por um mês...");
        barcoRentavelService.retornarBarcosAlugado(barcos);
    }
}
