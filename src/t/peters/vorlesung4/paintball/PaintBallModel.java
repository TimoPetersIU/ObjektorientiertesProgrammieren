package t.peters.vorlesung4.paintball;

import java.util.Random;

public class PaintBallModel {

    private final int ANZAHL_GEGNER = 10;
    private final int ANZAHL_VERBUENDETE = 3;
    private final int ANZAHL_LEBEN = 3;

    public String[] gegner;
    public String[] verbuendete;
    public String nextPerson;
    public int leben;
    public int punkte;

    public PaintBallModel() {
        this.gegner = new String[ANZAHL_GEGNER];
        this.verbuendete = new String[ANZAHL_VERBUENDETE];
        this.leben = ANZAHL_LEBEN;
        this.punkte = 0;
        fillArrays();
    }

    public void setNextPerson() {
        Random random = new Random();
        char zufaelligerChar = (char) ('a' + random.nextInt('m' - 'a' + 1));
        nextPerson = String.valueOf(zufaelligerChar);
    }

    private void fillArrays() {
        fillGegnerArray();
        fillVerbuendeteArray();
    }

    // Befüllt das "verbuendete"-Array mit den Buchstaben k-m
    private void fillVerbuendeteArray() {
        for (int i = 0; i < ANZAHL_VERBUENDETE; i++) {
            char buchstabe = (char) ('k' + i);
            verbuendete[i] = String.valueOf(buchstabe);
        }
    }

    // Befüllt das "gegner"-Array mit den Buchstaben a-j
    private void fillGegnerArray() {
        for (int i = 0; i < ANZAHL_GEGNER; i++) {
            char buchstabe = (char) ('a' + i);
            gegner[i] = String.valueOf(buchstabe);
        }
    }

    public String[] getGegner() {
        return this.gegner;
    }

    public String[] getVerbuendete() {
        return this.verbuendete;
    }

    public int getLeben() {
        return leben;
    }

    public int getPunkte() {
        return punkte;
    }

    public String getNextPerson() {
        return this.nextPerson;
    }
    public void incrementPunkte() {
        this.punkte++;
    }

    public void decrementLeben() {
        this.leben--;
    }
}
