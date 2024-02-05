package t.peters.vorlesung6.produktkatalog;

public class Produkt {

    private int preis;
    private String name;
    private String beschreibung;

    public Produkt(int preis, String name, String beschreibung) {
        this.preis = preis;
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public int getPreis() {
        return preis;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "preis=" + preis +
                ", name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                '}';
    }
}
