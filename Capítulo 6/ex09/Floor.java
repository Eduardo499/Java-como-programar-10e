package ex09;

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value (or type 'exit' to quit): ");
        
        while (scanner.hasNextDouble()) {
            double originalValue = scanner.nextDouble();
            double roundedValue = Math.floor(originalValue + 0.5);
            System.out.printf("Original value: %.2f, Rounded value: %.0f%n", originalValue, roundedValue);
            System.out.print("Enter another double value (or type 'exit' to quit): ");
        }
        
        System.out.println("Exiting program.");
        scanner.close();
    }
}