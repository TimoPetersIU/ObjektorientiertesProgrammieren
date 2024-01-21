package t.peters.vorlesung3;

import java.util.Scanner;

public class WarenkorbOnlineHaendler {
    public static void main(String[] args) {
        double gesamtwert = 0.0;
        double preis = 0.0;
        double niedrigsterWert = Double.MAX_VALUE;
        int anzahlArtikel = 0;
        Scanner sc = new Scanner(System.in);


        while (preis != 0.0) {
            System.out.println("Preis eingeben:");
            preis = sc.nextDouble();
            gesamtwert += preis;

            if (preis < niedrigsterWert && preis != 0.0) {
                niedrigsterWert = preis;
            }

            System.out.println();

            if (preis != 0.0) {
                anzahlArtikel++;
                System.out.println("Der Gesamtwert beträgt aktuell: " + gesamtwert);
                System.out.println("Artikel im Warenkorb: " + anzahlArtikel);
            }
        }

        if (anzahlArtikel >= 10 && gesamtwert > 100.0) {
            System.out.println("Der Rabatt beträgt: " + niedrigsterWert);
            System.out.println("Der Gesamtwert beträgt: " + (gesamtwert - niedrigsterWert));
        } else {
            System.out.println("Der Gesamtwert beträgt: " + (gesamtwert - niedrigsterWert));
        }

        sc.close();

    }

}
