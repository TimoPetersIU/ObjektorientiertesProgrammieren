package t.peters.volesung2;

import java.util.concurrent.ThreadLocalRandom;

public class EinarmigerBandit {
    public static void main(String[] args) {
        // Generiere drei zufällige Zahlen zwischen 1 und 6
        int randomNumber1 = generateRandomNumber(1, 6);
        int randomNumber2 = generateRandomNumber(1, 6);
        int randomNumber3 = generateRandomNumber(1, 6);

        // Zeige die generierten Zahlen an
        System.out.println(randomNumber1 + " " + randomNumber2 + " " + randomNumber3 + " ");

        // Bewerte das Ergebnis und gib eine entsprechende Nachricht ausnumber1 == number3 || number1 == number2
        evaluateResult(randomNumber1, randomNumber2, randomNumber3);
    }

    // Methode zur Generierung einer zufälligen Zahl im angegebenen Bereich
    private static int generateRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    // Methode zur Auswertung der generierten Zahlen und Ausgabe einer Nachricht
    private static void evaluateResult(int number1, int number2, int number3) {
        if (number1 == number2 && number1 == number3) {
            // Alle drei Zahlen sind gleich
            System.out.println("Super, Sie haben gewonnen!");
        } else if (number1 == number3 || number1 == number2 || number2 == number3) {
            // Zwei Zahlen sind gleich
            System.out.println("Fast geschafft!");
        } else {
            // Keine Übereinstimmungen
            System.out.println("Mehr Glück beim nächsten Mal");
        }
    }
}
