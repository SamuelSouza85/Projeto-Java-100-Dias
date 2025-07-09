package Dia059.Generics.GenericsMethods.Teste;

import Dia058.Generics.GenericClass.Dominio.Barco;


import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComObjeto(new Barco("Canoa bacana"));
        System.out.println(barcoList);
    }

    private static <T> List<T>  criarArrayComObjeto(T t){
        return List.of(t);
    }


//    private static <T extends Comparable<T>> List<T>  criarArrayComObjeto(T t){
//        return List.of(t);
//    }
}

