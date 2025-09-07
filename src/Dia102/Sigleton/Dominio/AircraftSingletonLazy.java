package Dia102.Sigleton.Dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> avaibleSets = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        avaibleSets.add("1A");
        avaibleSets.add("1B");
    }

    public static AircraftSingletonLazy getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new AircraftSingletonLazy("787-900");
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return avaibleSets.remove(seat);
    }
}
