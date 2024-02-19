package t.peters.vorlesung7.autohaus;

// Die Klasse Abschluss repräsentiert einen Abschluss im Autohaus
public abstract class Abschluss {
    private String vertriebler;
    private String kennzeichen;

    // Konstruktor für einen Abschluss
    public Abschluss(String vertriebler, String kennzeichen) {
        // Überprüfen, ob Vertriebler und Kennzeichen nicht null sind
        if (vertriebler == null || kennzeichen == null) {
            throw new IllegalArgumentException("Vertriebler und Kennzeichen dürfen nicht null sein");
        }
        this.vertriebler = vertriebler;
        this.kennzeichen = kennzeichen;
    }

    // Abstrakte Methode zur Berechnung des Werts des Abschlusses
    public abstract double getWert();

    // Getter-Methode für den Vertriebler
    public String getVertriebler() {
        return vertriebler;
    }

    // Getter-Methode für das Kennzeichen
    public String getKennzeichen() {
        return kennzeichen;
    }
}