package t.peters.vorlesung5.restaurant;

import java.util.Scanner;

public class Main {
    private static int besucher;
    private static String gerichtName;
   private static RestaurantRechner rechner = new RestaurantRechner();
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        userInteraction();

        double ergebnis = rechner.probabilityPerGericht(gerichtName, besucher);
        System.out.println(gerichtName + " wird im Schnitt " + (int) ergebnis + " mal bestellt bei " + besucher + " Besuchern");
    }

    private static void userInteraction() {
        System.out.println("Wie viele Besucher?");
        besucher = scanner.nextInt();
        System.out.println("Welches Gericht?");
        scanner.nextLine();
        gerichtName = scanner.nextLine();
    }
}
