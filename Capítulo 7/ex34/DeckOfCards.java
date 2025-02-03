package ex34;

import java.util.*;

public class DeckOfCards {
    private static final List<Card> deck = new ArrayList<>();
    private static final Face[] faces = Face.values();
    private static final Suit[] suits = Suit.values();

    // Constructor to initialize the deck of cards
    public DeckOfCards() {
        for (Suit suit : suits) {
            for (Face face : faces) {
                deck.add(new Card(face, suit));
            }
        }
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

    // Deal one card from the deck
    public Card dealCard() {
        return deck.remove(deck.size() - 1);
    }

    // Deal a hand of 5 cards
    public List<Card> dealHand() {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(dealCard());
        }
        return hand;
    }
}
