package t.peters.vorlesung5.restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRechner {
    List<Gericht> gerichte;

    public RestaurantRechner() {
        this.gerichte = new ArrayList<>();
        fillGerichte();
    }

    private void fillGerichte() {
        gerichte.add(new Gericht("Pizza", 0.6));
        gerichte.add(new Gericht("Pasta", 0.3));
        gerichte.add(new Gericht("Suppe", 0.1));
    }

    public double probabilityPerGericht(String gerichtName, int besucherAnzahl) {
        for (Gericht g : gerichte) {
            if (g.getName().equals(gerichtName)) {
                return g.getWahrscheinlichkeit() * besucherAnzahl;
            }
        }
        return 0.0;
    }
}
