package t.peters.vorlesung4.kontaktverzeichnis;

import java.util.Scanner;

// Die Klasse View ist für die Benutzerschnittstelle des Kontaktverzeichnis-Programms verantwortlich.
public class View {
    // Scanner-Objekt zur Benutzereingabe
    private Scanner scanner;

    // Controller-Objekt zur Verwaltung der Kontaktliste
    private Controller controller;

    // Konstruktor zur Initialisierung des Scanner- und Controller-Objekts
    public View(Controller controller) {
        this.scanner = new Scanner(System.in);
        this.controller = controller;
    }

    // Methode zur Verarbeitung der Benutzereingabe für das Hauptmenü
    public void handleMenuItem() {
        System.out.println("N = Neuer Kontakt; K = Alle Kontakte anzeigen; I = Mit einem Kontakt interagieren");
        String input = scanner.nextLine();
        switch (input) {
            case "N":
                newKontakt();
                break;
            case "K":
                showAllKontakte();
                break;
            case "I":
                interactWithKontakt();
                break;
            default:
                System.out.println("Eingabe ungültig!");
        }
    }

    // Methode zur Erstellung eines neuen Kontakts
    private void newKontakt() {
        System.out.print("Kontaktname: ");
        String kontaktName = scanner.nextLine();
        controller.addKontakt(kontaktName);
        System.out.println(kontaktName + " wurde erfolgreich hinzugefügt");
    }

    // Methode zur Anzeige aller Kontakte
    private void showAllKontakte() {
        for (Kontakt k : controller.getKontaktList()) {
            System.out.println(k);
        }
    }

    // Methode zur Benutzerinteraktion mit einem bestimmten Kontakt
    private void interactWithKontakt() {
        System.out.print("Kontaktname: ");
        String kontaktName = scanner.nextLine();
        kontaktInteraktion(kontaktName);
    }

    // Methode zur Interaktion mit einem bestimmten Kontakt basierend auf Benutzereingabe
    private void kontaktInteraktion(String kontaktName) {
        if (controller.hasKontakt(kontaktName)) {
            System.out.println("S = Telefonummern anzeigen; N = Telefonnummer hinzufügen");
            String input = scanner.nextLine();
            switch (input) {
                case "S":
                    showTelefonnummern(kontaktName);
                    break;
                case "N":
                    addTelefonnummer(kontaktName);
                    break;
                default:
                    System.out.println("Eingabe ungültig!");
            }
        } else {
            System.out.println("Kontakt nicht vorhanden");
        }
    }

    // Methode zum Hinzufügen einer Telefonnummer zu einem Kontakt
    private void addTelefonnummer(String kontaktName) {
        System.out.print("Telefonnummer eingeben: ");
        String telefonnummer = scanner.nextLine();
        controller.addTelefonnummer(kontaktName, telefonnummer);
    }


    // Methode zur Anzeige der Telefonnummern eines bestimmten Kontakts
    private void showTelefonnummern(String kontaktName) {
        System.out.println("Telefonnummern von: " + kontaktName);
        for (String telefonnummer : controller.getTelefonnummernOfKontakt(kontaktName)) {
            System.out.println(telefonnummer);
        }
    }
}
