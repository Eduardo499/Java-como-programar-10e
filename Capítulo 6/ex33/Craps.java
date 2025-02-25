import java.security.SecureRandom;
import java.util.Scanner;

public class Craps 
{
   // create secure random number generator for use in method rollDice
   private static final SecureRandom randomNumbers = new SecureRandom();
   private static final Scanner input = new Scanner(System.in);

   // enum type with constants that represent the game status
   private enum Status {CONTINUE, WON, LOST};

   // constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

   // plays one game of craps
   public static void main(String[] args)
   {
      int bankBalance = 1000; // initial bank balance
      while (bankBalance > 0) {
         System.out.printf("Current bank balance: $%d%n", bankBalance);
         System.out.print("Enter your wager: ");
         int wager = input.nextInt();

         while (wager > bankBalance || wager <= 0) {
            System.out.print("Invalid wager. Enter a valid wager: ");
            wager = input.nextInt();
         }

         int myPoint = 0; // point if no win or loss on first roll
         Status gameStatus; // can contain CONTINUE, WON or LOST

         int sumOfDice = rollDice(); // first roll of the dice

         // determine game status and point based on first roll 
         switch (sumOfDice) 
         {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll           
               gameStatus = Status.WON;
               break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
               gameStatus = Status.LOST;
               break;
            default: // did not win or lose, so remember point         
               gameStatus = Status.CONTINUE; // game is not over
               myPoint = sumOfDice; // remember the point
               System.out.printf("Point is %d%n", myPoint);
               break;
         } 

         // while game is not complete
         while (gameStatus == Status.CONTINUE) // not WON or LOST
         { 
            sumOfDice = rollDice(); // roll dice again

            // determine game status
            if (sumOfDice == myPoint) // win by making point
               gameStatus = Status.WON;
            else 
               if (sumOfDice == SEVEN) // lose by rolling 7 before point
                  gameStatus = Status.LOST;
         } 

         // display won or lost message and update bank balance
         if (gameStatus == Status.WON) {
            System.out.println("Player wins");
            bankBalance += wager;
            System.out.printf("New bank balance: $%d%n", bankBalance);
         } else {
            System.out.println("Player loses");
            bankBalance -= wager;
            System.out.printf("New bank balance: $%d%n", bankBalance);
            if (bankBalance == 0) {
               System.out.println("Sorry. You busted!");
               break;
            }
         }

         // display a random conversation message
         displayConversation();
      }
   }

   // roll dice, calculate sum and display results
   public static int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      // display results of this roll
      System.out.printf("Player rolled %d + %d = %d%n", 
         die1, die2, sum);

      return sum; 
   }

   // display a random conversation message
   public static void displayConversation() {
      String[] messages = {
         "Oh, you're going for broke, huh?",
         "Aw c'mon, take a chance!",
         "You're up big. Now's the time to cash in your chips!"
      };
      int index = randomNumbers.nextInt(messages.length);
      System.out.println(messages[index]);
   }
} // end class Craps