package Dia063.Comportamento.Teste;

import Dia063.Comportamento.Dominio.Car;
import Dia063.Comportamento.Interface.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste02 {
    private static List<Car> cars = List.of(new Car("green", 2011),new Car("green", 2001), new Car("black", 1998), new Car("red", 2019), new Car("red", 2005));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//          @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
        List<Car> greenCars = filter(cars,car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars,car -> car.getColor().equals("red"));
        List<Car> yearBeforeCars = filter(cars,car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filter = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filter.add(car);
            }
        }
        return filter;
    }


}
