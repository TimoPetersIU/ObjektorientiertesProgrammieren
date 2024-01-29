package t.peters.vorlesung5.pyramiedenrechner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Länge der Grundseite (a): ");
        double a = scanner.nextDouble();
        System.out.println("Höhe (h): ");
        double h = scanner.nextDouble();
        Pyramide pyramide = new Pyramide(a, h);
        System.out.println(pyramide.v());
    }
}
