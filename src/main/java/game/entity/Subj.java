package game.entity;

public enum Subj {
    Stone("Stone", 0),
    Scissors("Scissors", 1),
    Paper("Paper", 2);
    private final String name;
    private final int value;

    Subj(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
