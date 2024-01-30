package t.peters.vorlesung5.restaurant;

import java.util.Scanner;

// Die Klasse Main enthält die Hauptmethode des Programms, die die Benutzerinteraktion koordiniert.
public class Main {
    // Variablen für die Anzahl der Besucher und den Namen des ausgewählten Gerichts
    private static int besucher;
    private static String gerichtName;

    // Instanz der RestaurantRechner-Klasse
    private static RestaurantRechner rechner = new RestaurantRechner();

    // Scanner-Objekt für die Benutzereingabe
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Benutzerinteraktion aufrufen
        userInteraction();

        // Wahrscheinlichkeit für das ausgewählte Gericht berechnen
        double ergebnis = rechner.probabilityPerGericht(gerichtName, besucher);

        // Ergebnis ausgeben
        System.out.println(gerichtName + " wird im Schnitt " + (int) ergebnis + " mal bestellt bei " + besucher + " Besuchern");
    }

    // Methode für die Benutzerinteraktion
    private static void userInteraction() {
        // Anzahl der Besucher abfragen
        System.out.println("Wie viele Besucher?");
        besucher = scanner.nextInt();

        // Ausgewähltes Gericht abfragen
        System.out.println("Welches Gericht?");
        scanner.nextLine(); // Leere Zeile überspringen, um den vorherigen Zeilenumbruch zu vermeiden
        gerichtName = scanner.nextLine();
    }
}
