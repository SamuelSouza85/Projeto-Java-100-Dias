package Dia102.Sigleton.Dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    // Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> avaibleSets = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        avaibleSets.add("1A");
        avaibleSets.add("1B");
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return avaibleSets.remove(seat);
    }
}
