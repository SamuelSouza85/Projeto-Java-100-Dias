package Dia058.Generics.GenericClass.Service;

import Dia058.Generics.GenericClass.Dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDiponiveis = new ArrayList<>
            (List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarBarcosDisponível(){
        System.out.println("Buscando Barco disponível......");
        Barco Barco = barcosDiponiveis.remove(0);
        System.out.println("Alugando Barco: " + Barco);
        System.out.println("barcos disponiveis para alugar: ");
        System.out.println(barcosDiponiveis);
        return  Barco;
    }
    public  void  retornarBarcosAlugado(Barco barco){
        System.out.println("Devolvendo " +barco);
        barcosDiponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDiponiveis);
    }
}
