package t.peters.vorlesung7.digitalerstreichelzoo;

public class Tier {
    private String name;
    public static long maxTimeTillUnhappy;
    private long letzerZeitpunktStreicheln;

    public Tier(String name ) {
        this.name = name;
        maxTimeTillUnhappy = 10000;
    }

    public void streicheln() {
        letzerZeitpunktStreicheln = System.currentTimeMillis();
    }

    public boolean isHappy() {
        return (System.currentTimeMillis() - letzerZeitpunktStreicheln) <= maxTimeTillUnhappy;
    }

    public String getName() {
        return name;
    }

    public void setLetzerZeitpunktStreicheln(long letzerZeitpunktStreicheln) {
        this.letzerZeitpunktStreicheln = letzerZeitpunktStreicheln;
    }

    @Override
    public String toString() {
        String happy;
        if (isHappy()) {
            happy = "glücklich";
        } else {
            happy = "unglücklich";
        }

        return this.name + ": " + happy;
    }
}
