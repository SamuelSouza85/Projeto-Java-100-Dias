package Dia102.Sigleton.Teste;

import Dia102.Sigleton.Dominio.Aircraft;
import Dia102.Sigleton.Dominio.AircraftSigletonEager;

public class AircraftTeste01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTeste01.bookSeat("1A");
    }

    static void bookSeat(String seat) {
        System.out.println(AircraftSigletonEager.getINSTANCE());
        AircraftSigletonEager aircraft = AircraftSigletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
