import java.util.*;

public class DeckOfCardsTest {
   // Execute application
   public static void main(String[] args) {
      int playerWins = 0;
      int computerWins = 0;
      Scanner scanner = new Scanner(System.in);

      for (int i = 0; i < 20; i++) {
         System.out.println("Game " + (i + 1) + ":");

         // Create and shuffle the deck
         DeckOfCards myDeckOfCards = new DeckOfCards();
         myDeckOfCards.shuffle(); // Place cards in random order

         // Deal a hand to the player
         List<Card> playerHand = myDeckOfCards.dealHand();
         System.out.println("Your hand:");
         printHand(playerHand);

         // Player chooses cards to discard and replace
         playerHand = playerMove(playerHand, scanner);

         // Deal a hand to the computer
         List<Card> computerHand = myDeckOfCards.dealHand();
         System.out.println("\nComputer's hand:");
         printHand(computerHand);

         // Evaluate both hands
         int playerRank = evaluateHand(playerHand);
         int computerRank = evaluateHand(computerHand);

         // Determine the winner
         if (playerRank > computerRank) {
            System.out.println("\nYou win!");
            playerWins++;
         } else if (playerRank < computerRank) {
            System.out.println("\nComputer wins!");
            computerWins++;
         } else {
            System.out.println("\nIt's a tie!");
         }

         System.out.println("\n--------------------------------");
      }

      // Display the final results
      System.out.println("Player Wins: " + playerWins);
      System.out.println("Computer Wins: " + computerWins);

      // Determine the overall winner
      if (playerWins > computerWins) {
         System.out.println("\nYou are the overall winner!");
      } else if (playerWins < computerWins) {
         System.out.println("\nComputer is the overall winner!");
      } else {
         System.out.println("\nIt's a tie overall!");
      }
   }

   // Print the hand
   public static void printHand(List<Card> hand) {
      for (Card card : hand) {
         System.out.println(card);
      }
   }

   // Player's move (select cards to discard)
   public static List<Card> playerMove(List<Card> hand, Scanner scanner) {
      System.out.println("\nWhich cards would you like to discard? (Enter 1-5 for each card you want to discard, separated by spaces):");
      for (int i = 0; i < hand.size(); i++) {
         System.out.println((i + 1) + ". " + hand.get(i));
      }
      String input = scanner.nextLine();
      String[] discardIndexes = input.split(" ");
      Set<Integer> discardSet = new HashSet<>();
      for (String idx : discardIndexes) {
         try {
            int index = Integer.parseInt(idx.trim()) - 1;
            if (index >= 0 && index < hand.size()) {
               discardSet.add(index);
            }
         } catch (NumberFormatException e) {
            System.out.println("Invalid input, skipping...");
         }
      }

      // Replace discarded cards with new cards from the deck
      DeckOfCards myDeckOfCards = new DeckOfCards();
      List<Card> newHand = new ArrayList<>(hand);
      for (int i = 0; i < hand.size(); i++) {
         if (discardSet.contains(i)) {
            newHand.set(i, myDeckOfCards.dealCard());
         }
      }
      return newHand;
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
      String suit = hand.get(0).getSuit();
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
