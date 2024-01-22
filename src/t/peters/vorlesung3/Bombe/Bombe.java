package t.peters.vorlesung3.Bombe;

public class Bombe {
    public Draht draht;

    public Bombe() {

    }

    // Generiert einen zufälligen Draht
    public void generateRandomDraht() {
        int randomIndex = (int) (Math.random() * Draht.values().length);
        this.draht = Draht.values()[randomIndex];
    }

    public Draht getDraht() {
        return draht;
    }
}
