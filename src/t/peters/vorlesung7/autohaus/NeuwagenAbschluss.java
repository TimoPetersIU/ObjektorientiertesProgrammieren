package t.peters.vorlesung7.autohaus;

import java.text.DecimalFormat;

// Klasse für den Abschluss eines Neuwagens
public class NeuwagenAbschluss extends Abschluss {
    private double listenpreis;
    private double rabatt;

    // Konstruktor für einen Neuwagenabschluss
    public NeuwagenAbschluss(String vertriebler, String kennzeichen, double listenpreis, double rabatt) {
        super(vertriebler, kennzeichen);
        this.listenpreis = listenpreis;
        this.rabatt = rabatt;
    }

    // Methode zur Berechnung des Werts des Neuwagenabschlusses
    @Override
    public double getWert() {
        // Berechnung des Werts: (Listenpreis - Rabatt) * 10
        double wert = (listenpreis - rabatt) * 10;
        return roundToThreeDecimalPlaces(wert);
    }

    // Methode zur Rundung einer Zahl auf drei Nachkommastellen
    private double roundToThreeDecimalPlaces(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.###"); // Formatierung auf drei Nachkommastellen
        return "NeuwagenAbschluss{" +
                "vertriebler=" + getVertriebler() +
                ", kennzeichen=" + getKennzeichen() +
                ", listenpreis=" + listenpreis +
                ", rabatt=" + rabatt +
                ", wert=" + df.format(getWert()) +
                '}';
    }
}