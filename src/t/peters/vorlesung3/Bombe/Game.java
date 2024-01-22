package t.peters.vorlesung3.Bombe;

import java.util.Scanner;

public class Game {

    private final int ANZAHL_LEBEN = 3;
    public Bombe bombe;
    public int leben;
    public int punkte;
    public Scanner scanner;

    // Konstruktor: Initialisiert das Spiel mit einer Bombe, Anzahl Leben und Scanner
    public Game() {
        this.bombe = new Bombe();
        this.leben = ANZAHL_LEBEN;
        this.punkte = 0;
        this.scanner = new Scanner(System.in);
    }

    public boolean isOver() {
        return !(leben > 0);
    }

    public boolean playRound(String draht) {
        this.bombe.generateRandomDraht();
        if (!this.bombe.getDraht().getFarbe().equalsIgnoreCase(draht)) {
            this.punkte++;
            return true;
        } else {
            this.leben--;
            return false;
        }
    }

    public int getLeben() {
        return leben;
    }

    public int getPunkte() {
        return punkte;
    }
}
