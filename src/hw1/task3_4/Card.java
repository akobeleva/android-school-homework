package hw1.task3_4;

public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return rank + " " + suit;
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
        return rank.getRankValue() * 3 + suit.toString().length() * 5;
    }

    public boolean isCardOfStandardDeck() {
        return rank.getRankValue() >= 2 && rank.getRankValue() <= 14 && suit != null;
    }

    public boolean isStronger(Card card) {
        return suit.equals(card.getSuit()) && rank.getRankValue() > card.getRank().getRankValue();
    }

    public static int compare(Card card1, Card card2) {
        return card1.compareTo(card2);
    }

    @Override
    public int compareTo(Card card) {
        int suitWeight = suit.getSuitValue();
        int otherSuitWeight = card.getSuit().getSuitValue();
        if (equals(card)){
            return 0;
        } else if ((suitWeight == otherSuitWeight && !isStronger(card)) || (suitWeight < otherSuitWeight)){
            return -1;
        } else {
            return 1;
        }
    }
}
