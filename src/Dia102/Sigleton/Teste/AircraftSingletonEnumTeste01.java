package Dia102.Sigleton.Teste;

import Dia102.Sigleton.Dominio.AircraftSigletonEnum;

public class AircraftSingletonEnumTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSigletonEnum.INSTANCE.hashCode());
        AircraftSigletonEnum instance = AircraftSigletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
