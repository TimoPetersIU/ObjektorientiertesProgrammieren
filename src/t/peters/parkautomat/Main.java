package t.peters.parkautomat;

import java.util.Scanner;

/**
 * Die Klasse t.peters.volesung2.Main enthält die Hauptmethode zum Ausführen des Parkautomaten.
 */
public class Main {
    /**
     * Der Einstiegspunkt für das Parkautomaten-Programm.
     */
    public static void main(String[] args) {
        startParkvorgang();
    }

    /**
     * Startet den Parkvorgang durch Eingabe der Parkdauer und Interaktion mit dem Parkautomaten.
     */
    private static void startParkvorgang() {
        System.out.println("Parkdauer eingeben: ");
        Scanner scanner = new Scanner(System.in);
            // Eingabe der Parkdauer durch den Benutzer.
            int parkdauer = scanner.nextInt();

            // Initialisierung des Parkautomaten mit der eingegebenen Parkdauer.
            Parkautomat parkautomat = new Parkautomat(parkdauer);
            // Abruf der aktuellen Gebühr.
            double gebuehr = parkautomat.getGebuehr();

            // Die Schleife läuft, solange die Gebühr positiv ist (Parkvorgang nicht vollständig bezahlt).
            while (gebuehr > 0.0) {
                // Anzeige der aktuellen Restgebühr und Aufforderung zum Geldeinwurf.
                zeigeRestgebuehr(parkautomat);
                double muenze = scanner.nextDouble();

                // Überprüfung, ob die eingeworfene Münze akzeptiert wird.
                if (parkautomat.geldEinwerfen(muenze)) {
                    // Aktualisierung der Gebühr nach einem erfolgreichen Geldeinwurf.
                    gebuehr = parkautomat.getGebuehr();
                } else {
                    System.out.println("Münze nicht akzeptiert!");
                }
            }

            // Anzeige der Erfolgsmeldung nach erfolgreicher Bezahlung und Ausgabe des Restgelds.
            zeigeBezahlungErfolgreich(parkautomat);
            scanner.close();

    }

    /**
     * Zeigt die aktuelle Restgebühr und die Aufforderung zum Geldeinwurf an.
     *
     * @param parkautomat Der Parkautomat, dessen Zustand angezeigt wird.
     */
    private static void zeigeRestgebuehr(Parkautomat parkautomat) {
        System.out.println("Bereits bezahlt: " + parkautomat.getBetrag());
        System.out.println("Die Restgebühr beträgt: " + parkautomat.getGebuehr());
        System.out.println("Geld einwerfen:");
    }

    /**
     * Zeigt eine Erfolgsmeldung nach erfolgreicher Bezahlung und gibt das Restgeld aus.
     *
     * @param parkautomat Der Parkautomat, dessen Zustand nach erfolgreicher Bezahlung angezeigt wird.
     */
    private static void zeigeBezahlungErfolgreich(Parkautomat parkautomat) {
        System.out.println("Bezahlung erfolgreich. Parkticket wird ausgegeben!");
        System.out.println("Das Restgeld beträgt: " + parkautomat.getRestgeld());
    }
}
