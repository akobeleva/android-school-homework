package hw1.task2;

public class CardC {
    private int rank;
    private String suit;
    private static int maxRankDiamonds = 1;
    private static int maxRankClubs = 1;
    private static int maxRankHearts = 1;
    private static int maxRankSpades = 1;

    public CardC(int rank, String suit) {
        switch (suit) {
            case "diamonds":
                if (rank > maxRankDiamonds) maxRankDiamonds = rank;
                this.suit = suit;
                break;
            case "clubs":
                if (rank > maxRankClubs) maxRankClubs = rank;
                this.suit = suit;
                break;
            case "hearts":
                if (rank > maxRankHearts) maxRankHearts = rank;
                this.suit = suit;
                break;
            case "spades":
                if (rank > maxRankSpades) maxRankSpades = rank;
                this.suit = suit;
                break;
            default:
                System.out.println("Not standard suit");
                break;
        }
        this.suit = suit;
        this.rank = rank;
    }

    public CardC(String suit) {
        switch (suit) {
            case "diamonds":
                rank = maxRankDiamonds + 1;
                maxRankDiamonds++;
                this.suit = suit;
                break;
            case "clubs":
                rank = maxRankClubs + 1;
                maxRankClubs++;
                this.suit = suit;
                break;
            case "hearts":
                rank = maxRankHearts + 1;
                maxRankHearts++;
                this.suit = suit;
                break;
            case "spades":
                rank = maxRankSpades + 1;
                maxRankSpades++;
                this.suit = suit;
                break;
            default:
                System.out.println("Not standard suit");
                this.rank = 2;
                break;
        }
        this.suit = suit;
    }

    public int getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }
}
