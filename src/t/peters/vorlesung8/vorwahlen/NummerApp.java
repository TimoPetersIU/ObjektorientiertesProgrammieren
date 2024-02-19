package t.peters.vorlesung8.vorwahlen;

public class NummerApp {
    public static void main(String[] args) {
        Person p = new Person("Peter Lustig", "1234567", Nationalitaet.PE);
        System.out.println(p.getName() + ": " + p.getFullTelefonnummer());
    }
}
