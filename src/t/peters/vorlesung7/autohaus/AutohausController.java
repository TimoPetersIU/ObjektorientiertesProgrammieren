package t.peters.vorlesung7.autohaus;

import java.util.ArrayList;
import java.util.List;

public class AutohausController {
    private List<Abschluss> abschlussList; // Liste zur Speicherung von Abschlussobjekten

    // Konstruktor
    public AutohausController() {
        this.abschlussList = new ArrayList<>(); // Initialisierung der Abschlussliste
    }

    // Methode zum Hinzufügen eines Abschlusses für Neuwagen
    public void addNeuwagenAbschluss(String vertriebler, String kennzeichen, double listenpreis, double rabatt) {
        // Erstellen eines NeuwagenAbschluss-Objekts
        Abschluss abschluss = new NeuwagenAbschluss(vertriebler, kennzeichen, listenpreis, rabatt);
        abschlussList.add(abschluss); // Hinzufügen des Abschlusses zur Liste
    }

    // Methode zum Hinzufügen eines Abschlusses für Gebrauchtwagen
    public void addGebrauchtwagenAbschluss(String vertriebler, String kennzeichen, double verkaufspreis, double einkaufspreis, int kilometerstand) {
        // Erstellen eines GebrauchtwagenAbschluss-Objekts
        Abschluss abschluss = new GebrauchtwagenAbschluss(vertriebler,kennzeichen, verkaufspreis, einkaufspreis, kilometerstand);
        abschlussList.add(abschluss); // Hinzufügen des Abschlusses zur Liste
    }

    // Methode zum Entfernen eines Abschlusses anhand des Kennzeichens
    public void removeAbschluss(String kennzeichen) {
        for (Abschluss abschluss : abschlussList) {
            if (abschluss.getKennzeichen().equals(kennzeichen)) { // Überprüfen, ob das Kennzeichen übereinstimmt
                abschlussList.remove(abschluss); // Entfernen des Abschlusses aus der Liste
                return; // Beenden der Methode, nachdem ein Abschluss entfernt wurde
            }
        }
    }

    // Methode zum Abrufen des Abschlusses mit dem höchsten Wert
    public Abschluss getHoechsterWert() {
        Abschluss hoechsterWert = abschlussList.get(0); // Annahme, dass der erste Abschluss den höchsten Wert hat
        for (Abschluss abschluss : abschlussList) {
            if (abschluss.getWert() > hoechsterWert.getWert()) { // Überprüfen, ob der aktuelle Abschluss einen höheren Wert hat
                hoechsterWert = abschluss; // Aktualisieren des Abschlusses mit dem höchsten Wert
            }
        }
        return hoechsterWert; // Rückgabe des Abschlusses mit dem höchsten Wert
    }

    @Override
    public String toString() {
        return "AutohausController{" +
                "abschlussList=" + abschlussList.toString() + // Ausgabe der Abschlussliste als String
                '}';
    }
}
