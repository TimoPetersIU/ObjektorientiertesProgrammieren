package t.peters.vorlesung3;

import java.util.Scanner;

public class Denkspiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anzahlLeben = 3;
        int punkte = 0;

        do {
            int zufallszahl = generateRandomNumber(1, 100);
            int richtigeAntwort = getCorrectAnswer(zufallszahl);

            System.out.println("Die Zufallszahl ist: " + zufallszahl + "\n0) Gerade\n1) Ungerade");
            int antwort = scanner.nextInt();

            if (isValidAnswer(antwort)) {
                if (antwort == richtigeAntwort) {
                    System.out.println("Korrekte Antwort");
                    punkte++;
                } else {
                    System.out.println("Falsche Antwort");
                    anzahlLeben--;
                }
            } else {
                System.out.println("Antwort ungültig!");
            }
        } while (anzahlLeben > 0);

        System.out.println("Es wurde 3 mal falsch geantwortet. Das Spiel ist vorbei.\nPunkteendstand: " + punkte);

        scanner.close();
    }

    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * 100) + 1;
    }


    private static int getCorrectAnswer(int zufallszahl) {
        return (zufallszahl % 2 == 0) ? 0 : 1;
    }

    private static boolean isValidAnswer(int antwort) {
        return antwort == 0 || antwort == 1;
    }
}
