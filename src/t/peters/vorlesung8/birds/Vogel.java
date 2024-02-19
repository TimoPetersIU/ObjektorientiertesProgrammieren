package t.peters.vorlesung8.birds;

public abstract class Vogel {
    private Position position;
    private String name;
    private String federfarbe;

    public Vogel(Position position, String name, String federfarbe) {
        this.position = position;
        this.name = name;
        this.federfarbe = federfarbe;
    }

    public abstract void fliegen(Position position);

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getFederfarbe() {
        return federfarbe;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Vogel{" +
                "position=" + position +
                ", name='" + name + '\'' +
                '}';
    }

}
