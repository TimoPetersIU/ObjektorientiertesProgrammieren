package t.peters.vorlesung5.restaurant;

public class Gericht {
    private String name;
    private double wahrscheinlichkeit;

    public Gericht(String name, double wahrscheinlichkeit) {
        this.name = name;
        this.wahrscheinlichkeit = wahrscheinlichkeit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWahrscheinlichkeit() {
        return wahrscheinlichkeit;
    }

    public void setWahrscheinlichkeit(double wahrscheinlichkeit) {
        this.wahrscheinlichkeit = wahrscheinlichkeit;
    }
}
