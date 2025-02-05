public class Date {
   private int month;
   private int day;
   private int year;

   private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   public Date(int month, int day, int year) {
       if (month < 1 || month > 12) {
           throw new IllegalArgumentException("Month must be 1-12");
       }
       if (year < 1) {
           throw new IllegalArgumentException("Year must be positive");
       }
       if (day < 1 || day > daysInMonth(month, year)) {
           throw new IllegalArgumentException("Invalid day for the given month and year");
       }
       this.month = month;
       this.day = day;
       this.year = year;
   }

   private int daysInMonth(int month, int year) {
       if (month == 2 && isLeapYear(year)) {
           return 29;
       }
       return daysPerMonth[month];
   }

   private boolean isLeapYear(int year) {
       return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
   }

   public void nextDay() {
       if (day < daysInMonth(month, year)) {
           day++;
       } else {
           day = 1;
           if (month < 12) {
               month++;
           } else {
               month = 1;
               year++;
           }
       }
   }

   public String toString() {
       return String.format("%d/%d/%d", month, day, year);
   }

   public static void main(String[] args) {
       Date date = new Date(12, 31, 2024);
       System.out.println("Initial Date: " + date);
       date.nextDay();
       System.out.println("After nextDay(): " + date);

       date = new Date(2, 28, 2024);
       date.nextDay();
       System.out.println("After nextDay() on leap year: " + date);
   }
}