package t.peters.vorlesung3;

import java.util.Scanner;

public class Supermarkt {

    public static void main(String[] args) {
        System.out.println("ID Eingeben");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        switch (id){
            case 4613:
                System.out.println("Banane\nPreis: 1,2");
                break;
            case 7461:
                System.out.println("Zahnbürste\nPreis: 2,2");
                break;
            case 7913:
                System.out.println("Kartoffel\nPreis: 0,5");
                break;
            default:
                System.out.println("Produkt unbekannt");
                break;
        }
        sc.close();
    }
}
