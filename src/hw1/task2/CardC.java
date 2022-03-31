package hw1.task2;

public class CardC {
    private int rank;
    private String suit;
    private static int maxRankDiamonds = 1;
    private static int maxRankClubs = 1;
    private static int maxRankHearts = 1;
    private static int maxRankSpades = 1;
    private final int MIN_RANK = 2;

    public CardC(int rank, String suit) {
        switch (suit) {
            case "diamonds":
                if (rank > maxRankDiamonds) maxRankDiamonds = rank;
                break;
            case "clubs":
                if (rank > maxRankClubs) maxRankClubs = rank;
                break;
            case "hearts":
                if (rank > maxRankHearts) maxRankHearts = rank;
                break;
            case "spades":
                if (rank > maxRankSpades) maxRankSpades = rank;
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
                break;
            case "clubs":
                rank = maxRankClubs + 1;
                maxRankClubs++;
                break;
            case "hearts":
                rank = maxRankHearts + 1;
                maxRankHearts++;
                break;
            case "spades":
                rank = maxRankSpades + 1;
                maxRankSpades++;
                break;
            default:
                System.out.println("Not standard suit");
                this.rank = MIN_RANK;
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
