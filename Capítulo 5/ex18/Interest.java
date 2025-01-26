public class Interest 
{
   public static void main(String args[])
   {
      int principal = 100000; // principal amount in cents
      int rate = 5; // interest rate in percent

      System.out.printf("%s%20s%n", "Year", "Amount on deposit");

      for (int year = 1; year <= 10; year++) 
      {
         int amount = (int)(principal * Math.pow(1.0 + rate / 100.0, year));

         int dollars = amount / 100;
         int cents = amount % 100;

         System.out.printf("%4d%,20d.%02d%n", year, dollars, cents);
      } 
   }
} 