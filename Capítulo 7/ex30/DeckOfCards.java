import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeckOfCards {
   private Card[] deck; // array of Card objects
   private int currentCard; // index of next Card to be dealt (0-51)
   private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
   // random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();

   // constructor fills deck of Cards
   public DeckOfCards() {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

      deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
      currentCard = 0; // first Card dealt will be deck[0]

      // populate deck with Card objects
      for (int count = 0; count < deck.length; count++) 
         deck[count] = 
            new Card(faces[count % 13], suits[count / 13]);
   }

   // shuffle deck of Cards with one-pass algorithm
   public void shuffle() {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0;

      // for each Card, pick another random Card (0-51) and swap them
      for (int first = 0; first < deck.length; first++) {
         // select a random number between 0 and 51 
         int second =  randomNumbers.nextInt(NUMBER_OF_CARDS);

         // swap current Card with randomly selected Card
         Card temp = deck[first];        
         deck[first] = deck[second];   
         deck[second] = temp;            
      }
   }

   // deal one Card
   public Card dealCard() {
      // determine whether Cards remain to be dealt
      if (currentCard < deck.length)
         return deck[currentCard++]; // return current Card in array
      else        
         return null; // return null to indicate that all Cards were dealt
   }

   // deal a hand of five cards
   public List<Card> dealHand() {
      List<Card> hand = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
         hand.add(dealCard());
      }
      return hand;
   }

   // Check for a pair
   public boolean hasPair(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      for (int count : faceCount.values()) {
         if (count == 2) return true;
      }
      return false;
   }

   // Check for two pairs
   public boolean hasTwoPairs(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      int pairCount = 0;
      for (int count : faceCount.values()) {
         if (count == 2) pairCount++;
      }
      return pairCount == 2;
   }

   // Check for a three-of-a-kind (trinca)
   public boolean hasThreeOfAKind(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      for (int count : faceCount.values()) {
         if (count == 3) return true;
      }
      return false;
   }

   // Check for a four-of-a-kind (quadra)
   public boolean hasFourOfAKind(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      for (int count : faceCount.values()) {
         if (count == 4) return true;
      }
      return false;
   }

   // Check for a flush (same suit)
   public boolean hasFlush(List<Card> hand) {
      String suit = hand.get(0).getSuit();
      for (Card card : hand) {
         if (!card.getSuit().equals(suit)) {
            return false;
         }
      }
      return true;
   }

   // Check for a straight (consecutive values)
   public boolean hasStraight(List<Card> hand) {
      List<Integer> values = new ArrayList<>();
      for (Card card : hand) {
         values.add(faceValue(card.getFace()));
      }
      Collections.sort(values);
      for (int i = 0; i < values.size() - 1; i++) {
         if (values.get(i) + 1 != values.get(i + 1)) {
            return false;
         }
      }
      return true;
   }

   // Check for a full house (three of one value and two of another)
   public boolean hasFullHouse(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      boolean threeOfAKind = false;
      boolean pair = false;
      for (int count : faceCount.values()) {
         if (count == 3) threeOfAKind = true;
         if (count == 2) pair = true;
      }
      return threeOfAKind && pair;
   }

   // Helper method to count the occurrences of each face in the hand
   private Map<String, Integer> countFaces(List<Card> hand) {
      Map<String, Integer> faceCount = new HashMap<>();
      for (Card card : hand) {
         faceCount.put(card.getFace(), faceCount.getOrDefault(card.getFace(), 0) + 1);
      }
      return faceCount;
   }

   // Helper method to convert face name to a numerical value for straights
   private int faceValue(String face) {
      switch (face) {
         case "Ace": return 14;
         case "King": return 13;
         case "Queen": return 12;
         case "Jack": return 11;
         case "Ten": return 10;
         case "Nine": return 9;
         case "Eight": return 8;
         case "Seven": return 7;
         case "Six": return 6;
         case "Five": return 5;
         case "Four": return 4;
         case "Three": return 3;
         case "Deuce": return 2;
         default: return 0;
      }
   }
}
