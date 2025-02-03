public class Card {
   private final String face; // face of card ("Ace", "Deuce", ...)
   private final String suit; // suit of card ("Hearts", "Diamonds", ...)

   // Constructor to initialize card's face and suit
   public Card(String face, String suit) {
      this.face = face;
      this.suit = suit;
   }

   // Return the face of the card
   public String getFace() {
      return face;
   }

   // Return the suit of the card
   public String getSuit() {
      return suit;
   }

   // String representation of the card
   public String toString() {
      return face + " of " + suit;
   }
}
