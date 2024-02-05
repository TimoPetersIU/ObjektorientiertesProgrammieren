package t.peters.vorlesung6.produktkatalog;

public class ProduktController {
    private Produkt[] produkte;

    public ProduktController() {
        this.produkte = new Produkt[100];
    }

    public Produkt[] getProdukte() {
        return produkte;
    }

    public void addProdukt(int preis, String name, String beschreibung) {
        Produkt newProdukt = new Produkt(preis, name, beschreibung);
        for (int i = 0; i < 100; i++) {
            if (produkte[i] == null) {
                produkte[i] = newProdukt;
                return;
            }
        }
    }

    public void deleteProdukt(String name) {
        for (int i = 0; i < 100; i++) {
            if (produkte[i].getName().equals(name)) {
                produkte[i] = null;
                return;
            }
        }
    }

    public Produkt mostExpensiveProdukt() {
        Produkt mostExpensive = produkte[0];
        for (Produkt p : produkte) {
            if (p != null &&  mostExpensive != null && p.getPreis() > mostExpensive.getPreis()) {
                mostExpensive = p;
            }
        }
        return mostExpensive;
    }

    public Produkt cheapestProdukt() {
        Produkt mostExpensive = produkte[0];
        for (Produkt p : produkte) {
            if (p != null && mostExpensive != null && p.getPreis() < mostExpensive.getPreis()) {
                mostExpensive = p;
            }
        }
        return mostExpensive;
    }
}
