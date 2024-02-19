package t.peters.vorlesung7.autohaus;

import java.text.DecimalFormat;

// Klasse für den Abschluss eines Gebrauchtwagens
public class GebrauchtwagenAbschluss extends Abschluss {
    private double verkaufspreis;
    private double einkaufspreis;
    private int kilometerstand;

    // Konstruktor für einen Gebrauchtwagenabschluss
    public GebrauchtwagenAbschluss(String vertriebler, String kennzeichen, double verkaufspreis, double einkaufspreis, int kilometerstand) {
        super(vertriebler, kennzeichen);
        this.verkaufspreis = verkaufspreis;
        this.einkaufspreis = einkaufspreis;
        this.kilometerstand = kilometerstand;
    }

    // Methode zur Berechnung des Werts des Gebrauchtwagenabschlusses
    @Override
    public double getWert() {
        // Berechnung des Werts: (Verkaufspreis - Einkaufspreis) * Kilometerstand
        double wert = (verkaufspreis - einkaufspreis) * kilometerstand;
        return roundToThreeDecimalPlaces(wert);
    }

    // Methode zur Rundung einer Zahl auf drei Nachkommastellen
    private double roundToThreeDecimalPlaces(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }

    // Überschriebene toString-Methode zur Erstellung einer String-Repräsentation des Gebrauchtwagenabschlusses
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.###"); // Formatierung auf drei Nachkommastellen
        return "GebrauchtwagenAbschluss{" +
                "vertriebler=" + getVertriebler() +
                ", kennzeichen=" + getKennzeichen() +
                ", verkaufspreis=" + verkaufspreis +
                ", einkaufspreis=" + einkaufspreis +
                ", kilometerstand=" + kilometerstand +
                ", wert=" + df.format(getWert()) +
                '}';
    }
}