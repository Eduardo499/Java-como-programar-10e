import java.util.*;

public class DeckOfCardsTest {
   // Execute application
   public static void main(String[] args) {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // Place cards in random order

      // Deal two hands of 5 cards
      List<Card> hand1 = myDeckOfCards.dealHand();
      List<Card> hand2 = myDeckOfCards.dealHand();

      System.out.println("Hand 1:");
      for (Card card : hand1) {
         System.out.println(card);
      }

      System.out.println("\nHand 2:");
      for (Card card : hand2) {
         System.out.println(card);
      }

      // Evaluate both hands
      int hand1Rank = evaluateHand(hand1);
      int hand2Rank = evaluateHand(hand2);

      // Determine the winner
      if (hand1Rank > hand2Rank) {
         System.out.println("\nHand 1 wins!");
      } else if (hand1Rank < hand2Rank) {
         System.out.println("\nHand 2 wins!");
      } else {
         System.out.println("\nIt's a tie!");
      }
   }

   // Evaluates a hand and returns a rank value
   public static int evaluateHand(List<Card> hand) {
      if (hasRoyalFlush(hand)) return 10;
      if (hasStraightFlush(hand)) return 9;
      if (hasFourOfAKind(hand)) return 8;
      if (hasFullHouse(hand)) return 7;
      if (hasFlush(hand)) return 6;
      if (hasStraight(hand)) return 5;
      if (hasThreeOfAKind(hand)) return 4;
      if (hasTwoPairs(hand)) return 3;
      if (hasPair(hand)) return 2;
      return 1; // High card
   }

   // Check for Royal Flush
   public static boolean hasRoyalFlush(List<Card> hand) {
      return hasStraightFlush(hand) && hand.contains(new Card("Ace", "Hearts"));
   }

   // Check for a straight flush
   public static boolean hasStraightFlush(List<Card> hand) {
      return hasStraight(hand) && hasFlush(hand);
   }

   // Check for a four-of-a-kind (quadra)
   public static boolean hasFourOfAKind(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      for (int count : faceCount.values()) {
         if (count == 4) return true;
      }
      return false;
   }

   // Check for a full house
   public static boolean hasFullHouse(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      boolean threeOfAKind = false;
      boolean pair = false;
      for (int count : faceCount.values()) {
         if (count == 3) threeOfAKind = true;
         if (count == 2) pair = true;
      }
      return threeOfAKind && pair;
   }

   // Check for a flush (all the same suit)
   public static boolean hasFlush(List<Card> hand) {
      String suit = (String) hand.get(0).getSuit();
      for (Card card : hand) {
         if (!card.getSuit().equals(suit)) {
            return false;
         }
      }
      return true;
   }

   // Check for a straight (consecutive values)
   public static boolean hasStraight(List<Card> hand) {
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

   // Check for a three-of-a-kind
   public static boolean hasThreeOfAKind(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      for (int count : faceCount.values()) {
         if (count == 3) return true;
      }
      return false;
   }

   // Check for two pairs
   public static boolean hasTwoPairs(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      int pairCount = 0;
      for (int count : faceCount.values()) {
         if (count == 2) pairCount++;
      }
      return pairCount == 2;
   }

   // Check for one pair
   public static boolean hasPair(List<Card> hand) {
      Map<String, Integer> faceCount = countFaces(hand);
      for (int count : faceCount.values()) {
         if (count == 2) return true;
      }
      return false;
   }

   // Helper method to count the occurrences of each face in the hand
   public static Map<String, Integer> countFaces(List<Card> hand) {
      Map<String, Integer> faceCount = new HashMap<>();
      for (Card card : hand) {
         faceCount.put(card.getFace(), faceCount.getOrDefault(card.getFace(), 0) + 1);
      }
      return faceCount;
   }

   // Helper method to convert face name to a numerical value for straights
   public static int faceValue(String face) {
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
