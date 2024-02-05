package t.peters.vorlesung6.produktkatalog;

import java.util.Scanner;

public class ProduktView {

    private ProduktController produktController = new ProduktController();
    private Scanner scanner = new Scanner(System.in);

    public void userInteraction() {

        while (true) {
            System.out.println("N = Neues Produkt\nD = Produkt löschen\nE = Teuerstes Produkt\nC = Günstigstes Produkt");
            String eingabe = scanner.nextLine();
            switch (eingabe) {
                case "N":
                    addProdukt();
                    break;
                case "D":
                    deleteProdukt();
                    break;
                case "E":
                    mostExpensiveProdukt();
                    break;
                case "C":
                    cheapesProdukt();
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
            }
        }
    }

    private void addProdukt() {
        int preis;
        String name;
        String beschreibung;
        System.out.print("Preis: ");
        preis = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Beschreibung: ");
        beschreibung = scanner.nextLine();

        produktController.addProdukt(preis, name, beschreibung);

    }

    private void deleteProdukt() {
        String name;
        System.out.print("Name des zu löschenden Produktes: ");
        name = scanner.nextLine();
        produktController.deleteProdukt(name);
    }

    private void mostExpensiveProdukt() {
        System.out.println(produktController.mostExpensiveProdukt().toString());
    }

    private void cheapesProdukt() {
        System.out.println(produktController.cheapestProdukt().toString());
    }
}
