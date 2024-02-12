package t.peters.vorlesung7.digitalerstreichelzoo;

import java.util.ArrayList;
import java.util.List;

public class Streichelzoo {

    private List<Tier> tiere;

    public Streichelzoo() {
        this.tiere = new ArrayList<>();
        fillTiere();
    }

    public void changeMaxTime(long newTime) {
        Tier.maxTimeTillUnhappy = newTime;
    }

    private void fillTiere() {
        tiere.add(new Tier("Hans"));
        tiere.add(new Tier("Schwein"));
        tiere.add(new Tier("Pferd"));
        tiere.add(new Tier("Hund"));
        tiere.add(new Tier("Ziege"));
    }

    public void streicheln(String name) {
        for (Tier t : tiere) {
            if (t.getName().equals(name)) {
                t.streicheln();
            }
        }
    }

    public boolean isHappy(String name) {
        for (Tier t : tiere) {
            if (t.getName().equals(name)) {
                return t.isHappy();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String returnStr = "";
        for (Tier t : tiere) {
            returnStr += t.toString() + "\n";
        }
        return returnStr;
    }
}
