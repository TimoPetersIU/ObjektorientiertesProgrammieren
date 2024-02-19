package t.peters.vorlesung7.autohaus;

import java.util.Scanner;

public class AutohausView {
    private AutohausController autohausController; // Referenz auf den AutohausController

    // Konstruktor
    public AutohausView() {
        this.autohausController = new AutohausController(); // Initialisierung des AutohausControllers
    }

    // Methode zur Starten der Benutzerinteraktion
    public void startUserInteraction() {
        while (true) {
            // Benutzeroptionen anzeigen
            System.out.println("N = Neuer Neuwagenabschluss, G = Gebrauchtwagen, A = Alle anzeigen, W = Höchster Wert");
            String input = getStringInput("Eingabe: "); // Eingabe des Benutzers einlesen
            switch (input) {
                case "N":
                    newNeuwagenAbschluss(); // Neuen Neuwagenabschluss hinzufügen
                    break;
                case "G":
                    newGebrauchtwagenAbschluss(); // Neuen Gebrauchtwagenabschluss hinzufügen
                    break;
                case "A":
                    showAllAbschluesse(); // Alle Abschlüsse anzeigen
                    break;
                case "W":
                    showHoechsterWert(); // Höchsten Wert anzeigen
                    break;
                default:
                    System.out.println("Ungültige Eingabe"); // Fehlermeldung für ungültige Eingabe
            }
        }
    }

    // Methode zum Anzeigen des Abschlusses mit dem höchsten Wert
    private void showHoechsterWert() {
        Abschluss hoechsterWert = autohausController.getHoechsterWert();
        System.out.println(hoechsterWert.toString()); // Ausgabe des Abschlusses mit dem höchsten Wert
    }

    // Methode zum Anzeigen aller Abschlüsse
    private void showAllAbschluesse() {
        System.out.println(autohausController.toString()); // Ausgabe aller Abschlüsse
    }

    // Methode zum Hinzufügen eines neuen Gebrauchtwagenabschlusses
    private void newGebrauchtwagenAbschluss() {
        String vertriebler = getStringInput("Vertriebler: "); // Eingabe des Vertrieblers
        String kennzeichen = getStringInput("Kennzeichen: "); // Eingabe des Kennzeichens
        double verkaufspreis = getDoubleInput("Verkaufspreis: "); // Eingabe des Verkaufspreises
        double einkaufspreis = getDoubleInput("Einkaufspreis: "); // Eingabe des Einkaufspreises
        int kilometerstand = getIntInput("Kilometerstand: "); // Eingabe des Kilometerstands

        // Hinzufügen des Gebrauchtwagenabschlusses zum AutohausController
        autohausController.addGebrauchtwagenAbschluss(vertriebler, kennzeichen, verkaufspreis, einkaufspreis, kilometerstand);
    }

    // Methode zum Hinzufügen eines neuen Neuwagenabschlusses
    private void newNeuwagenAbschluss() {
        String vertriebler = getStringInput("Vertriebler: "); // Eingabe des Vertrieblers
        String kennzeichen = getStringInput("Kennzeichen: "); // Eingabe des Kennzeichens
        double listenpreis = getDoubleInput("Listenpreis: "); // Eingabe des Listenpreises
        double rabatt = getDoubleInput("Rabatt: "); // Eingabe des Rabatts
        autohausController.addNeuwagenAbschluss(vertriebler, kennzeichen, listenpreis, rabatt); // Hinzufügen des Neuwagenabschlusses zum AutohausController
    }

    // Methode zum Einlesen von Zeichenfolgen
    private String getStringInput(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label);
        return scanner.nextLine(); // Rückgabe der eingegebenen Zeichenfolge
    }

    // Methode zum Einlesen von Dezimalzahlen
    private double getDoubleInput(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label);
        return scanner.nextDouble(); // Rückgabe der eingegebenen Dezimalzahl
    }

    // Methode zum Einlesen von ganzen Zahlen
    private int getIntInput(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label);
        return scanner.nextInt(); // Rückgabe der eingegebenen ganzen Zahl
    }
}
