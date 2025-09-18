public class Card {
    public int cardValue;
    public int cardSuit;

    public Card(int value, int suit) {
        this.cardValue = value;
        this.cardSuit = suit;
    }

    public int getValue() {
        return cardValue;
    }

    public int getSuit() {
        return cardSuit;
    }

    public String printCard() {
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
        return values[cardValue - 1] + " of " + suits[cardSuit];
    }

}
