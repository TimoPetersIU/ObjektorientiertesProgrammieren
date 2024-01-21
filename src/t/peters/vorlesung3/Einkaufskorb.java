package t.peters.vorlesung3;

import java.util.Scanner;

public class Einkaufskorb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie viele Produkte?");
        int anzahlProdukte = sc.nextInt();
        double gesamtpreis = 0;

        for(int i = 1; i <= anzahlProdukte; i++) {
            System.out.println("Preis eingeben");
            gesamtpreis += sc.nextDouble();
        }

        System.out.println("Gesamtpreis = " + gesamtpreis);

        sc.close();
    }
}
