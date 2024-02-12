package t.peters.vorlesung7.digitalerstreichelzoo;

import java.util.Scanner;

public class StreichelzooView {

    private Streichelzoo streichelzoo = new Streichelzoo();
    Scanner scanner = new Scanner(System.in);

    public void userInteraction() {
        while (true) {
            System.out.println(streichelzoo.toString());
            System.out.println("S = Streicheln      T = Zeispanne anpassen");

            String eingabe = scanner.nextLine();
            switch (eingabe) {
                case "S":
                    tierStreicheln();
                    break;
                case "T":
                    zeitspanneAnpassen();
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
            }

        }
    }

    private void tierStreicheln() {
        System.out.println("Welches Tier soll gestreichelt werden?");
        String eingabe = scanner.nextLine();
        streichelzoo.streicheln(eingabe);
        System.out.println(eingabe + " wurde gestreichelt");
    }

    private void zeitspanneAnpassen() {
        System.out.println("Neue Zeitspanne in MS:");
        Tier.maxTimeTillUnhappy = scanner.nextLong();
    }
}
