package t.peters.vorlesung3.Bombe;

import t.peters.parkautomat.Muenzwert;

import java.util.Scanner;

public class Game {

    private final int ANZAHL_LEBEN = 3;
    public Bombe bombe;
    public int leben;
    public Scanner scanner;

    public Game() {
        this.bombe = new Bombe();
        this.leben = ANZAHL_LEBEN;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        String draht;
        System.out.println("Du musst eine Bombe entschärfen!\nSchneide einen der Drähte durch:\nRot\nGrün\nBlau");
        while (leben > 0) {
            System.out.println("Wähle einen Draht:");
            draht = scanner.nextLine();
            if (isValid(draht)) {
                if (bombe.playRound(draht)) {
                    System.out.println("Du hast einen korrekten Draht durchgeschnitten");
                } else {
                    leben -= 1;
                    System.out.println("Die Bombe ist explodiert! Du verlierst ein Leben\nDu hast noch " + leben + " übrig");
                }
            } else {
                System.out.println("Ungültige Eingabe versuche es erneut");
            }

        }
        System.out.println("Du hast keine Leben mehr damit ist das Spiel vorbei");
        scanner.close();

    }

    private boolean isValid(String value) {
        for (Draht draht : Draht.values()) {
            if (value.equalsIgnoreCase(draht.getFarbe())) {
                return true;
            }
        }
        return false;
    }

}
