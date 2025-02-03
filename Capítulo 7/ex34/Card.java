package ex34;

public class Card {
    private final Face face;
    private final Suit suit;

    // Constructor to initialize the face and suit of the card
    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    // Getter for the face
    public Face getFace() {
        return face;
    }

    // Getter for the suit
    public Suit getSuit() {
        return suit;
    }

    // ToString method to display the card's face and suit
    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
