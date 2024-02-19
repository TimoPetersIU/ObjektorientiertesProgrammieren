package t.peters.vorlesung8.vorwahlen;

public enum Nationalitaet {
    BE("Belgien", "+32"),
    E("Spanien", "+34"),
    D("Deutschland", "+49"),
    PE("Peru", "+51"),
    IL("Israel", "+972");

    private final String name;
    private final String vorwahl;

    Nationalitaet(String name, String vorwahl) {
        this.name = name;
        this.vorwahl = vorwahl;
    }

    public String getName() {
        return name;
    }

    public String getVorwahl() {
        return vorwahl;
    }
}
