package t.peters.vorlesung6.getraenkeautomat;

import java.util.Scanner;

public class View {
    private Automat controller;
    private Scanner scanner;

    public View() {
        this.controller = new Automat();
        this.scanner = new Scanner(System.in);
    }

    public void userInteraction() {
        while (true) {
            System.out.println("Der Gesamtpreis ist aktuell: " + controller.getGesamtPreis());
            System.out.println("0 = reset   1 = Wasser   2 = Limonade   3 = Eistee");
            int eingabe = scanner.nextInt();
            controller.setGewaehltesGetraenk(eingabe);
            if (eingabe != 0) {
                System.out.println(controller.getNameOf(eingabe) + " kostet " + controller.getPreisOf(eingabe) + "€");
                System.out.print("Menge: ");
                eingabe = scanner.nextInt();
                controller.bestelleMenge(eingabe);
            } else {
                System.out.println("Der Automat wird zurückgesetzt");
                controller.reset();
            }
        }
    }
}
