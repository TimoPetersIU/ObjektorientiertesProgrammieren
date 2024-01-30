package t.peters.vorlesung5.restaurant;

// Die Klasse Gericht repräsentiert ein Gericht in einem Restaurant.
public class Gericht {
    // Name des Gerichts
    private String name;

    // Wahrscheinlichkeit, mit der das Gericht ausgewählt wird
    private double wahrscheinlichkeit;

    // Konstruktor für die Initialisierung eines Gerichts mit Name und Wahrscheinlichkeit
    public Gericht(String name, double wahrscheinlichkeit) {
        this.name = name;
        this.wahrscheinlichkeit = wahrscheinlichkeit;
    }

    // Methode zum Abrufen des Namens des Gerichts
    public String getName() {
        return name;
    }

    // Methode zum Setzen des Namens des Gerichts
    public void setName(String name) {
        this.name = name;
    }

    // Methode zum Abrufen der Wahrscheinlichkeit des Gerichts
    public double getWahrscheinlichkeit() {
        return wahrscheinlichkeit;
    }

    // Methode zum Setzen der Wahrscheinlichkeit des Gerichts
    public void setWahrscheinlichkeit(double wahrscheinlichkeit) {
        this.wahrscheinlichkeit = wahrscheinlichkeit;
    }
}
