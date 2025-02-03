import java.security.SecureRandom;
import java.util.*;

public class DeckOfCards {
   private Card[] deck; // Array of Card objects
   private int currentCard; // Index of next card to be dealt (0-51)
   private static final int NUMBER_OF_CARDS = 52; // Constant number of cards
   private static final SecureRandom randomNumbers = new SecureRandom();

   // Constructor fills deck of cards
   public DeckOfCards() {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
                        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

      deck = new Card[NUMBER_OF_CARDS]; // Create array of Card objects
      currentCard = 0; // First card dealt will be deck[0]

      // Populate deck with Card objects
      for (int count = 0; count < deck.length; count++) 
         deck[count] = new Card(faces[count % 13], suits[count / 13]);
   }

   // Shuffle deck of cards
   public void shuffle() {
      currentCard = 0; // Reset current card index

      // Shuffle the deck
      for (int first = 0; first < deck.length; first++) {
         int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
         Card temp = deck[first];
         deck[first] = deck[second];
         deck[second] = temp;
      }
   }

   // Deal a single card
   public Card dealCard() {
      if (currentCard < deck.length) {
         return deck[currentCard++];
      } else {
         return null; // Return null if all cards are dealt
      }
   }

   // Deal a hand of 5 cards
   public List<Card> dealHand() {
      List<Card> hand = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
         hand.add(dealCard());
      }
      return hand;
   }

public String hasFullHouse(List<Card> hand) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'hasFullHouse'");
}
}
