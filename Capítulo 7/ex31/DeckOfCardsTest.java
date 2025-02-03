import java.util.List;

public class DeckOfCardsTest {
   // execute application
   public static void main(String[] args) {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order

      // Deal a hand of 5 cards
      List<Card> hand = myDeckOfCards.dealHand();
      System.out.println("Hand of 5 cards:");
      for (Card card : hand) {
         System.out.println(card);
      }

      // Check for different poker hands
      System.out.println("\nChecking hand:");
      System.out.println("Pair: " + myDeckOfCards.hasPair(hand));
      System.out.println("Two Pairs: " + myDeckOfCards.hasTwoPairs(hand));
      System.out.println("Three of a Kind: " + myDeckOfCards.hasThreeOfAKind(hand));
      System.out.println("Four of a Kind: " + myDeckOfCards.hasFourOfAKind(hand));
      System.out.println("Flush: " + myDeckOfCards.hasFlush(hand));
      System.out.println("Straight: " + myDeckOfCards.hasStraight(hand));
      System.out.println("Full House: " + myDeckOfCards.hasFullHouse(hand));
   }
}