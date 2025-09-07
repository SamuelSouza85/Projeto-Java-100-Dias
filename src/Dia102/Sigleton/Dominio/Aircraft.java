package Dia102.Sigleton.Dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> avaibleSets = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        avaibleSets.add("1A");
        avaibleSets.add("1B");
    }

    public boolean bookSeat(String seat) {
        return avaibleSets.remove(seat)
                ;
    }
}
