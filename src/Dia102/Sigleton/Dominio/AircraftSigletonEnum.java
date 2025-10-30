package Dia102.Sigleton.Dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSigletonEnum {
    INSTANCE;
    private final Set<String> avaibleSeats;

    AircraftSigletonEnum() {
        this.avaibleSeats = new HashSet<>();
        this.avaibleSeats.add("1A");
        this.avaibleSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return avaibleSeats.remove(seat);
    }
}
