package t.peters.volesung2;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Erste Zahl: ");
        a = scanner.nextInt();
        System.out.println("Zweite Zahl: ");
        b = scanner.nextInt();
        System.out.println(a + " " + "+ "  + b + " = " + (a + b));
        System.out.println(a + " " + "- "  + b + " = " + (a - b));
        System.out.println(a + " " + "* "  + b + " = " + (a * b));
        System.out.println(a + " " + "/ "  + b + " = " + (a / b));
        scanner.close();
    }
}
