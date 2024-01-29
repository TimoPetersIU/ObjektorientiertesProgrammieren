package t.peters.vorlesung4.paintball;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class View {
    private final int ANZAHL_SEKUNDEN = 3;
    public PaintBallController controller;
    public PaintBallModel model;

    public View(PaintBallModel model) {
        this.controller = new PaintBallController(model);
        this.model = model;
    }

    public void start() {
        System.out.println("Willkomment beim Paintball Spiel!\nGegner: " + showGegner() + "\nVerbündete: " + showVerbuendete() + "\n[1] Schießen\n[2] Nicht schießen");
        while (controller.isOver()) {
            playRound();
        }
        System.out.println("Es sind keine Leben mehr übrig somit ist das Spiel vorbei\nEndpunktestand: " + model.getPunkte());
    }

    private void playRound() {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        model.setNextPerson();
        System.out.println("Vor dir steht " + model.getNextPerson() + "\nMöchtest du schießen?");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handleTimeUp();
            }
        }, ANZAHL_SEKUNDEN * 1000);

        try {
            int input = scanner.nextInt();
            scanner.close();
            if (controller.correctMove(input)) {
                System.out.println("Korrekter Treffer!");
            } else {
                System.out.println("Das war ein Fehler!");
            }
            showLebenUndPunkte();
        } catch (java.util.InputMismatchException e) {
            handleInvalidInput();
        }

    }

    private void handleTimeUp() {
        System.out.println("Die Zeit ist abgelaufen! Du verlierst ein Leben");
        model.decrementLeben();
        showLebenUndPunkte();
    }

    private void handleInvalidInput() {
        System.out.println("Ungültige Eingabe!");
    }

    private String showGegner() {
        return Arrays.toString(model.getGegner());
    }
    private String showVerbuendete() {
        return Arrays.toString(model.getVerbuendete());
    }

    private void showLebenUndPunkte() {
        System.out.println("Leben: " + model.getLeben() + "\nPunkte: " + model.getPunkte());
    }
}
