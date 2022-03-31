package hw1.task2;

public class CardB {
    private int rank;
    private String suit;

    public CardB(int rank, String suit) {
        this.rank = rank;
        if (suit.equals("diamonds") || suit.equals("clubs") || suit.equals("hearts") || suit.equals("spades")) {
            this.suit = suit;
        } else System.out.println("Not standard suit");

    }

    public int getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }
}
