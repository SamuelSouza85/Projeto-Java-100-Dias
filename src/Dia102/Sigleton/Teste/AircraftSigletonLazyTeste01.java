package Dia102.Sigleton.Teste;

import Dia102.Sigleton.Dominio.AircraftSigletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSigletonLazyTeste01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSigletonLazy.getINSTANCE());
        System.out.println(AircraftSigletonLazy.getINSTANCE());
        Constructor<AircraftSigletonLazy> constructor = AircraftSigletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSigletonLazy aircraftSigletonLazy = constructor.newInstance("787-900");
        System.out.println(aircraftSigletonLazy);

    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSigletonLazy.getINSTANCE());
        AircraftSigletonLazy aircraft = AircraftSigletonLazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
