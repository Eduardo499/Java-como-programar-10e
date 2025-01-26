package ex29;

public class TheTwelveDaysOfChristmas {
    public static void main(String[] args) {
        String[] gifts = {
            "a Partridge in a Pear Tree", "Two Turtle Doves",
            "Three French Hens", "Four Calling Birds", "Five Golden Rings",
            "Six Geese a Laying", "Seven Swans a Swimming",
            "Eight Maids a Milking", "Nine Ladies Dancing",
            "Ten Lords a Leaping", "Eleven Pipers Piping",
            "Twelve Drummers Drumming"
        };
        for (int i = 0; i < 12; i++) {
            String day;
            switch (i) {
                case 0: day = "first"; break;
                case 1: day = "second"; break;
                case 2: day = "third"; break;
                case 3: day = "fourth"; break;
                case 4: day = "fifth"; break;
                case 5: day = "sixth"; break;
                case 6: day = "seventh"; break;
                case 7: day = "eighth"; break;
                case 8: day = "ninth"; break;
                case 9: day = "tenth"; break;
                case 10: day = "eleventh"; break;
                case 11: day = "twelfth"; break;
                default: day = ""; break;
            }
            System.out.println("On the " + day + " day of Christmas");
            System.out.println("My true love sent to me:");
            for (int j = i; j >= 0; j--) {
                if (j == 0 && i != 0) {
                    System.out.print("And ");
                }
                System.out.println(gifts[j]);
            }
            System.out.println();
        }
    }
}