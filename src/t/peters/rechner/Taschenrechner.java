package t.peters.rechner;

public class Taschenrechner {
    public static void main(String[] args) {
        double zahl1 = 10;
        double zahl2 = 5;

        for (Operation op : Operation.values()) {
            double ergebnis = op.calculate(zahl1, zahl2);
            System.out.println(zahl1 + " " + op.getSymbol() + " " + zahl2 + " = " + ergebnis);
        }
    }
}