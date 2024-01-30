package t.peters.vorlesung4.kontaktverzeichnis;

import java.util.ArrayList;
import java.util.List;

// Die Klasse Kontakt repräsentiert einen einzelnen Kontakt im Kontaktverzeichnis.
public class Kontakt {
    // Name des Kontakts
    private String name;

    // Liste zur Speicherung der Telefonnummern des Kontakts
    private List<String> telefonnummern;

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
        telefonnummern.remove(telefonnummer);
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
