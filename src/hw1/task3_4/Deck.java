package hw1.task3_4;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    private Deck() {
        deck = new ArrayList<>(52);
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public static Deck createDeck() {
        return new Deck();
    }

    public static Card getRandomCard() {
        Deck deck = new Deck();
        deck.shuffle();
        int i = (int) (Math.random() * 52);
        return deck.deck.get(i);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void sort() {
        deck.sort(Card::compareTo);
    }

    public Card getCard() {
        if (!isEmpty()) {
            return deck.remove(0);
        } else return null;
    }

    public void addCard(Card card) {
        if (!deck.contains(card)) {
            deck.add(card);
        } else {
            System.out.println("Deck contains " + card.toString());
        }
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            StringBuilder sb = new StringBuilder();
            deck.forEach((card) -> sb.append(card.toString()).append(", "));
            return new String(sb);
        } else return "Deck is empty";
    }
}
