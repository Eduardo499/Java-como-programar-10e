package ex10;

import java.util.Scanner;

public class Floor {
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value (or type 'exit' to quit): ");
        
        while (scanner.hasNextDouble()) {
            double originalValue = scanner.nextDouble();
            double roundedToInteger = roundToInteger(originalValue);
            double roundedToTenths = roundToTenths(originalValue);
            double roundedToHundredths = roundToHundredths(originalValue);
            double roundedToThousandths = roundToThousandths(originalValue);

            System.out.printf("Original value: %.6f%n", originalValue);
            System.out.printf("Rounded to integer: %.0f%n", roundedToInteger);
            System.out.printf("Rounded to tenths: %.1f%n", roundedToTenths);
            System.out.printf("Rounded to hundredths: %.2f%n", roundedToHundredths);
            System.out.printf("Rounded to thousandths: %.3f%n", roundedToThousandths);
            System.out.print("Enter another double value (or type 'exit' to quit): ");
        }
        
        System.out.println("Exiting program.");
        scanner.close();
    }
}