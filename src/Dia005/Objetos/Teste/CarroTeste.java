package Dia005.Objetos.Teste;

import Dia005.Objetos.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Toyata Corola";
        carro.modelo = "Xei";
        carro.ano = 2022;

        carro2.nome = "Honda Civic";
        carro2.modelo = "Touring";
        carro2.ano = 2023;

        System.out.println("O primeiro carro é um " + carro.nome+ " " + carro.modelo + " " + carro.ano );
        System.out.println("O Segundo carro é um " + carro2.nome+ " " + carro2.modelo + " " + carro2.ano );

    }
}
