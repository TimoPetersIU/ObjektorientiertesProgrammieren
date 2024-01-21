package t.peters.parkautomat;

/**
 * Das Enum Muenzwert repräsentiert verschiedene Münzwerte, die vom Parkautomaten akzeptiert werden.
 */
public enum Muenzwert {
    FIVE_CENTS(0.05),    // Münzwert von 5 Cent.
    TEN_CENTS(0.1),      // Münzwert von 10 Cent.
    TWENTY_CENTS(0.2),   // Münzwert von 20 Cent.
    FIFTY_CENTS(0.5),    // Münzwert von 50 Cent.
    ONE_EURO(1.0),       // Münzwert von 1 Euro.
    TWO_EUROS(2.0);      // Münzwert von 2 Euro.

    private final double wert;  // Der Wert der Münze.

    /**
     * Konstruktor für das Enum Muenzwert.
     *
     * @param wert Der Wert der Münze.
     */
    Muenzwert(double wert) {
        this.wert = wert;
    }

    /**
     * Gibt den Wert der Münze zurück.
     *
     * @return Der Wert der Münze.
     */
    public double getWert() {
        return wert;
    }
}
