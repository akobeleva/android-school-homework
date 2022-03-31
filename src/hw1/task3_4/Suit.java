package hw1.task3_4;

public enum Suit {
    CLUBS(1), DIAMONDS(2), SPADES(3), HEARTS(4);

    private final int suitValue;

    Suit(int value) {
        suitValue = value;
    }

    public int getSuitValue() {
        return suitValue;
    }
}
