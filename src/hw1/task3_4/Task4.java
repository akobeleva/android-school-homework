package hw1.task3_4;

public class Task4 {
    public static void main(String[] args) {
        Deck deck = Deck.createDeck();
        System.out.println(deck.toString());

        Card card1 = deck.getCard();
        Card card2 = deck.getCard();
        Card card3 = deck.getCard();

        deck.addCard(card3);
        deck.addCard(card2);
        deck.addCard(card2);
        System.out.println(deck.toString());

        deck.shuffle();
        System.out.println(deck.toString());

        deck.sort();
        System.out.println(deck.toString());

        Card card = deck.getCard();
        while (card != null){
            card = deck.getCard();
        }
        System.out.println(deck.toString());
    }
}
