package ex34;

import java.util.*;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        // Create and shuffle the deck
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        // Deal a hand to the player
        List<Card> playerHand = myDeckOfCards.dealHand();
        System.out.println("Your hand:");
        printHand(playerHand);

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
        } else if (playerRank < computerRank) {
            System.out.println("\nComputer wins!");
        } else {
            System.out.println("\nIt's a tie!");
        }
    }

    // Print the hand
    public static void printHand(List<Card> hand) {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    // Evaluates a hand and returns a rank value
    public static int evaluateHand(List<Card> hand) {
        // Evaluation logic for the hand can be added here
        return 0; // Placeholder for now
    }
}
