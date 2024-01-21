package t.peters.parkautomat;

/**
 * Modell eines einfachen Parkautomaten.
 */
public class Parkautomat {
    // Konstanten für Grundgebühr, Minuten pro Einheit und Erhöhung pro Einheit.
    private static final double GRUNDGEBUEHR = 1.25;
    private static final double MINUTEN_PRO_EINHEIT = 30;
    private static final double ERHOEHUNG_PRO_EINHEIT = 1.5;

    // Instanzvariablen für die aktuelle Gebühr und das Restgeld.
    public double gebuehr;
    public double betrag;
    public double restgeld;

    /**
     * Konstruktor für die Klasse Parkautomat.
     *
     * @param parkdauer Die Parkdauer in Minuten, um die Gebühr zu berechnen.
     */
    public Parkautomat(int parkdauer) {
        // Initialisierung der Grundgebühr und Berechnung der Gebühr basierend auf der Parkdauer.
        this.gebuehr = GRUNDGEBUEHR;
        this.betrag = 0.0;
        parkdauerSetzen(parkdauer);
    }

    /**
     * Die Methode geldEinwerfen ermöglicht das Einwerfen von Münzen in den Parkautomaten.
     *
     * @param menge Die eingeworfene Menge Geld.
     * @return true, wenn die Münze gültig ist und die Gebühr erfolgreich verringert wurde, sonst false.
     */
    public boolean geldEinwerfen(double menge) {
        // Überprüfung, ob die eingeworfene Münze gültig ist.
        if (isValid(menge)) {
            // Verringerung der Gebühr um den Münzwert.
            gebuehr -= menge;
            // Erhöhung des Betrags um den Münzwert.
            betrag += menge;
            // Überprüfung, ob Restgeld zurückgegeben werden muss.
            if (gebuehr < 0.0) {
                restgeld = gebuehr * -1.0;
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Die Methode parkdauerSetzen berechnet die Gebühr basierend auf der Parkdauer in 30-Minuten-Schritten.
     *
     * @param parkdauer Die Parkdauer in Minuten.
     */
    private void parkdauerSetzen(int parkdauer) {
        // Berechnung der abgerundeten Parkdauer in 30-Minuten-Schritten.
        double angebrochen = Math.ceil((double) parkdauer / MINUTEN_PRO_EINHEIT);
        // Erhöhung der Gebühr um 1,5 Euro pro angebrochener 30-Minuten-Einheit.
        gebuehr += ERHOEHUNG_PRO_EINHEIT * angebrochen;
    }

    /**
     * Die Methode isValid überprüft, ob die eingeworfene Münze einen gültigen Wert hat.
     *
     * @param value Der Wert der eingeworfenen Münze.
     * @return true, wenn die Münze gültig ist, sonst false.
     */
    private boolean isValid(double value) {
        // Überprüfung, ob der Wert der Münze in der Liste der gültigen Münzwerte vorhanden ist.
        for (Muenzwert muenzwert : Muenzwert.values()) {
            if (value == muenzwert.getWert()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Getter-Methode für die aktuelle Gebühr.
     *
     * @return Die aktuelle Gebühr.
     */
    public double getGebuehr() {
        return gebuehr;
    }

    /**
     * Getter-Methode für den gezahlten Betrag.
     *
     * @return Den gezahlten Betrag.
     */
    public double getBetrag() {
        return betrag;
    }

    /**
     * Getter-Methode für das Restgeld.
     *
     * @return Das Restgeld, das zurückgegeben wird.
     */
    public double getRestgeld() {
        return restgeld;
    }
}
