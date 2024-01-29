package t.peters.vorlesung5.pyramiedenrechner;

public class Pyramide {
    private double a;
    private double h;

    public Pyramide(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    public double v() {
        return ((1.0/3.0) * (a * a) * h);
    }
}
