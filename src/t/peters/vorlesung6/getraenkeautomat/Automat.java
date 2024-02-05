package t.peters.vorlesung6.getraenkeautomat;

public class Automat {

    private double gesamtPreis;
    private int gewaehltesGetraenk;



    public Automat() {
        this.gesamtPreis = 0.0;
        this.gewaehltesGetraenk = 0;
    }

    public double getPreisOf(int nummer) {
        for (Getraenk g : Getraenk.values()) {
            if (g.getNummer() == nummer) {
                return g.getPreis();
            }
        }
        return 0.0;
    }

    public String getNameOf(int nummer) {
        for (Getraenk g : Getraenk.values()) {
            if (g.getNummer() == nummer) {
                return g.getName();
            }
        }
        return "";
    }

    public void bestelleMenge(int menge) {
        double preis = getPreisOf(gewaehltesGetraenk);
        gesamtPreis += menge * preis;
    }

    public void reset() {
        gesamtPreis = 0.0;
    }

    public double getGesamtPreis() {
        return gesamtPreis;
    }

    public void setGewaehltesGetraenk(int gewaehltesGetraenk) {
        this.gewaehltesGetraenk = gewaehltesGetraenk;
    }
}
