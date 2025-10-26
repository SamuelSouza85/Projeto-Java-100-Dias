package Dia102.Sigleton.Dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSigletonEager {
    //Eager initialization
    private static final AircraftSigletonEager INSTANCE = new AircraftSigletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;


    private AircraftSigletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSigletonEager getINSTANCE() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
