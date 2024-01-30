package t.peters.vorlesung4.kontaktverzeichnis;

import java.util.ArrayList;
import java.util.List;

// Die Klasse Kontakt repräsentiert einen einzelnen Kontakt im Kontaktverzeichnis.
public class Kontakt {
    // Name des Kontakts
    public String name;

    // Liste zur Speicherung der Telefonnummern des Kontakts
    public List<String> telefonnummern;

    // Konstruktor zur Initialisierung des Kontakts mit einem Namen und einer leeren Liste für Telefonnummern
    public Kontakt(String name) {
        this.name = name;
        this.telefonnummern = new ArrayList<>();
    }

    // Methode zum Hinzufügen einer Telefonnummer zum Kontakt
    public void addTelefonnummer(String telefonnummer) {
        this.telefonnummern.add(telefonnummer);
    }

    // Methode zum Entfernen einer Telefonnummer aus dem Kontakt
    public void removeTelefonnummer(String telefonnummer) {
        // Durchlaufe die Liste der Telefonnummern
        for (int i = 0; i < this.telefonnummern.size(); i++) {
            String eintrag = this.telefonnummern.get(i);
            // Überprüfe, ob der Eintrag der zu entfernenden Telefonnummer entspricht
            if (eintrag != null && eintrag.equals(telefonnummer)) {
                // Entferne die Telefonnummer aus der Liste
                this.telefonnummern.remove(i);
            }
        }
    }

    // Methode zum Abrufen des Namens des Kontakts
    public String getName() {
        return name;
    }

    // Methode zum Abrufen der Liste der Telefonnummern des Kontakts
    public List<String> getTelefonnummern() {
        return telefonnummern;
    }

    // Überschriebene toString-Methode zur Erzeugung einer String-Repräsentation des Kontakts
    @Override
    public String toString() {
        return "Kontakt{" +
                "name='" + name + '\'' +
                ", telefonnummern=" + telefonnummern.toString() +
                '}';
    }
}
