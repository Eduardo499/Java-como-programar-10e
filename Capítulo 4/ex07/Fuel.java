package ex07;

import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance = 0;
        double fuel;
        double fuelTotal = 0;
        double distanceTotal = 0;

        while (distance != -1){
            System.out.print("Enter the driving distance (-1 to exit): ");
            distance = input.nextDouble();

            if (distance == -1){
                break;
            }

            System.out.print("Enter the fuel consumption: ");
            fuel = input.nextDouble();

            fuelTotal += fuel;
            distanceTotal += distance;

            System.out.printf("The fuel consumption per km is %.2f\n", fuel / distance);
            System.out.printf("The total fuel consumption is %.2f\n", fuelTotal);
            System.out.printf("The total distance is %.2f\n", distanceTotal);

        }
        System.out.printf("The average fuel consumption is %.2f\n", fuelTotal / distanceTotal);

        input.close();
    }
}
