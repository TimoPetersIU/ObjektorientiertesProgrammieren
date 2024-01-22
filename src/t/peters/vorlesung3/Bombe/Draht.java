package t.peters.vorlesung3.Bombe;

public enum Draht {
    ROT("Rot"), GRUEN("Grün"), BLAU("Blau");

    private final String farbe;

    Draht(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }
}
