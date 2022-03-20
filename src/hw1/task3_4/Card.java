package hw1.task3_4;

import java.util.Arrays;

public class Card implements Comparable<Card> {
    private int rank;
    private String suit;
    private final String[] rankStrings = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
            "Queen", "King", "Ace"};
    private final String[] suitStrings = {"clubs", "diamonds", "spades", "hearts"};

    public Card(int rank, String suit) {
        this.rank = rank;
        if (!Arrays.asList(suitStrings).contains(suit)) {
            System.out.println("Not standard suit");
        }
        this.suit = suit;
    }

    public int getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        if (rank >= 2 && rank <= 14) {
            return rankStrings[rank - 2] + " " + suit;
        } else return rank + " " + suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) {
            return false;
        }
        Card other = (Card) obj;
        return rank == other.getRank() && suit.equals(other.getSuit());
    }

    @Override
    public int hashCode() {
        return rank * 3 + suit.length() * 5;
    }

    public boolean isCardOfStandardDeck() {
        return rank >= 2 && rank <= 14 && Arrays.asList(suitStrings).contains(suit);
    }

    public boolean isStronger(Card card) {
        return suit.equals(card.getSuit()) && rank > card.getRank();
    }

    public static int compare(Card card1, Card card2) {
        return card1.compareTo(card2);
    }

    @Override
    public int compareTo(Card card) {
        int suitWeight = Arrays.asList(suitStrings).indexOf(suit);
        int otherSuitWeight = Arrays.asList(suitStrings).indexOf(card.getSuit());
        if (equals(card)){
            return 0;
        } else if ((suitWeight == otherSuitWeight && !isStronger(card)) || (suitWeight < otherSuitWeight)){
            return -1;
        } else {
            return 1;
        }
    }
}
