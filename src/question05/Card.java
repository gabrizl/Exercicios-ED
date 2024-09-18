package question05;

public class Card {
    private String rank;
    private String suit;
    private Card next;
    private Card prev;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        this.next = null;
        this.prev = null;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public Card getNext() {
        return next;
    }

    public void setNext(Card next) {
        this.next = next;
    }

    public Card getPrev() {
        return prev;
    }

    public void setPrev(Card prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
