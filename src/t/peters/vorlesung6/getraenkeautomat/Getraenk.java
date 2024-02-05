package t.peters.vorlesung6.getraenkeautomat;

public enum Getraenk {
    WASSER(1, "Wasser", 1.2),
    LIMONADE(2, "Limonade", 1.8),
    EISTEE(3, "Eistee", 1.5);

    private final int nummer;
    private final String name;
    private final double preis;

    Getraenk(int nummer, String name, double preis) {
        this.nummer = nummer;
        this.name = name;
        this.preis = preis;
    }

    public int getNummer() {
        return nummer;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }
}
