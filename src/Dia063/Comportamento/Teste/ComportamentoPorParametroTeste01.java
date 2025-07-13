package Dia063.Comportamento.Teste;

import Dia063.Comportamento.Dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {
    private static List<Car> cars = List.of(new Car("green", 2011),new Car("green", 2001), new Car("black", 1998), new Car("red", 2019), new Car("red", 2005));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterCarByColor(cars, "green"));

        System.out.println("----------");
        System.out.println(filterByYearBefore(cars, 2015));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> byColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                byColor.add(car);
            }
        }
        return byColor;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int age) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < age) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }

}
