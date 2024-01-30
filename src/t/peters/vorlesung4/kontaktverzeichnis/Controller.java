package t.peters.vorlesung4.kontaktverzeichnis;

import java.util.ArrayList;
import java.util.List;

// Die Klasse Controller verwaltet das Kontaktverzeichnis und bietet Methoden für die Verwaltung von Kontakten.
public class Controller {
    // Liste zur Speicherung der Kontakte
    public List<Kontakt> kontaktList;

    // Konstruktor für die Initialisierung der Kontaktliste
    public Controller() {
        this.kontaktList = new ArrayList<>();
    }

    // Methode zum Hinzufügen eines neuen Kontakts mit dem angegebenen Namen
    public void addKontakt(String kontaktName) {
        // Überprüfen, ob der Kontakt noch nicht vorhanden ist und der Name nicht leer ist
        if (!kontaktList.contains(kontaktName) && !kontaktName.equals("")) {
            // Neuen Kontakt erstellen und zur Liste hinzufügen
            Kontakt newKontakt = new Kontakt(kontaktName);
            kontaktList.add(newKontakt);
        }
    }

    // Methode zum Hinzufügen einer Telefonnummer zu einem vorhandenen Kontakt
    public void addTelefonnummer(String kontaktName, String telefonnummer) {
        // Durchlaufe die Liste der Kontakte
        for (Kontakt k : kontaktList) {
            // Überprüfe, ob der aktuelle Kontakt mit dem angegebenen Namen übereinstimmt
            if (k.getName().equals(kontaktName)) {
                // Füge die Telefonnummer zum Kontakt hinzu
                k.addTelefonnummer(telefonnummer);
            }
        }
    }

    // Methode zur Anzeige der Telefonnummern eines bestimmten Kontakts
    public String showTelefonnummern(String kontaktName) {
        // Durchlaufe die Liste der Kontakte
        for (Kontakt k : kontaktList) {
            // Überprüfe, ob der aktuelle Kontakt mit dem angegebenen Namen übereinstimmt
            if (k.getName().equals(kontaktName)) {
                // Liefere die Telefonnummern als String zurück
                return k.toString();
            }
        }
        // Fall: Kontakt nicht vorhanden
        return "Kontakt nicht vorhanden";
    }

    // Methode zum Abrufen der gesamten Kontaktliste
    public List<Kontakt> getKontaktList() {
        return kontaktList;
    }

    // Methode zum Abfragen, ob ein Kontakt vorhanden ist
    public boolean hasKontakt(String kontaktName) {
        for (Kontakt k : kontaktList) {
            if (k.getName().equals(kontaktName)) {
                return true;
            }
        }
        return false;
    }

    // Methode zum Abrufen der Telefonnummern eines bestimmten Kontakts
    public List<String> getTelefonnummernOfKontakt(String kontaktName) {
        for (Kontakt k : kontaktList) {
            if (k.getName().equals(kontaktName)) {
                return k.getTelefonnummern();
            }
        }
        return null;
    }
}
