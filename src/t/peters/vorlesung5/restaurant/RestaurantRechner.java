package t.peters.vorlesung5.restaurant;

import java.util.ArrayList;
import java.util.List;

// Die Klasse RestaurantRechner stellt Funktionen zum Berechnen von Wahrscheinlichkeiten für Gerichte in einem Restaurant bereit.
public class RestaurantRechner {
    // Liste, die die verfügbaren Gerichte im Restaurant enthält
    List<Gericht> gerichte;

    // Konstruktor für die Initialisierung der Liste der Gerichte und Befüllung mit Standardgerichten
    public RestaurantRechner() {
        this.gerichte = new ArrayList<>();
        fillGerichte();
    }

    // Private Methode zum Hinzufügen von Standardgerichten zur Liste
    private void fillGerichte() {
        gerichte.add(new Gericht("Pizza", 0.6));
        gerichte.add(new Gericht("Pasta", 0.3));
        gerichte.add(new Gericht("Suppe", 0.1));
    }

    // Methode zur Berechnung der Wahrscheinlichkeit eines bestimmten Gerichts für eine gegebene Anzahl von Besuchern
    public double probabilityPerGericht(String gerichtName, int besucherAnzahl) {
        // Durchlaufe die Liste der Gerichte
        for (Gericht g : gerichte) {
            // Überprüfe, ob das aktuelle Gericht mit dem gesuchten Gericht übereinstimmt
            if (g.getName().equals(gerichtName)) {
                // Berechne und liefere die Wahrscheinlichkeit für das Gericht und die Anzahl der Besucher
                return g.getWahrscheinlichkeit() * besucherAnzahl;
            }
        }
        // Falls das Gericht nicht gefunden wurde, gebe 0 zurück
        return 0.0;
    }
}
