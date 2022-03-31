package hw1.task2;

public class Task2 {
    public static void main(String[] args) {
        CardC card1 = new CardC(10, "diamonds");
        CardC card2 = new CardC("diamonds");
        System.out.println(card2.getRank());

        CardC card3 = new CardC("hearts");
        System.out.println(card3.getRank());

        CardC card4 = new CardC("hearts");
        System.out.println(card4.getRank());

        CardC card5 = new CardC(10, "hearts");
        System.out.println(card5.getRank());
    }
}
