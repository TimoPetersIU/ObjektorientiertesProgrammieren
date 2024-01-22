package t.peters.vorlesung3.Bombe;

import java.util.Random;

public class Bombe {
    public Draht draht;

    public Bombe() {
        draht = generateRandomDraht();
    }

    private Draht generateRandomDraht() {
        return getRandomEnumValue(Draht.class);
    }

    private <T extends Enum<?>> T getRandomEnumValue(Class<T> enumeration) {
        Random random = new Random();
        T[] values = enumeration.getEnumConstants();
        System.out.println();
        return values[random.nextInt(values.length)];
    }

    public boolean playRound(String draht) {
        if (draht.equalsIgnoreCase(this.draht.getFarbe())) {
            this.draht = generateRandomDraht();
            return false;
        } else {
            this.draht = generateRandomDraht();
            return true;
        }
    }

}
