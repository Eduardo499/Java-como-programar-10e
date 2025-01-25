public class Interest 
{
   public static void main(String args[])
   {
      double amount;
      double principal = 1000.0; 

      for (int i = 5; i <= 10; i++) {
         System.out.printf("Interest rate: %d%%%n", i);
         System.out.printf("%s%20s%n", "Year", "Amount on deposit");

         for (int year = 1; year <= 10; year++) 
         {
            amount = principal * Math.pow(1.0 + (double) i / 100, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
         }
         System.out.println();
      }
   }
} 