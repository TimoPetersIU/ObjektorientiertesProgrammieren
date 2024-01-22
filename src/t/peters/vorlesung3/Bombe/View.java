package t.peters.vorlesung3.Bombe;

import java.util.Scanner;

public class View {
    public Game game;
    public Scanner scanner;

    public View() {
        this.game = new Game();
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        String draht;
        System.out.println("Du musst eine Bombe entschärfen!\nSchneide einen der Drähte durch:\nRot\nGrün\nBlau");
        while(!game.isOver()) {
            System.out.println("Wähle einen Draht:");
            draht = scanner.nextLine();
            if (isValid(draht)) {
                if (game.playRound(draht)) {
                    System.out.println("Du hast einen korrekten Draht durchgeschnitten\nPunkte: " + game.getPunkte());
                } else {
                    System.out.println("Die Bombe ist explodiert! Du verlierst ein Leben\nDu hast noch " + game.getLeben() + " übrig");
                }
            } else {
                System.out.println("Ungültige Eingabe, versuche es erneut");
            }
        }
        System.out.println("Du hast keine Leben mehr, damit ist das Spiel vorbei\nDu hast " + game.getPunkte() + " Punkt erreicht");

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
