package t.peters.vorlesung8.birds;

public enum Position {
    STRAND("STRAND"),
    BAUM_A("BAUM_A"),
    BAUM_B("BAUM_B");

    private final String name;

    Position(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
