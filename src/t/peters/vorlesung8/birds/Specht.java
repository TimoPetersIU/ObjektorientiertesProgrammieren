package t.peters.vorlesung8.birds;

public class Specht extends Vogel{

    public Specht(Position position, String name, String federfarbe) {
        super(position, name, federfarbe);
    }

    @Override
    public void fliegen(Position position) {
        setPosition(position);
    }

    public void lochPicken() {

    }

}
