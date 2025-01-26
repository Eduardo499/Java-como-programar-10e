package ex32;

import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double housing, food, clothing, transportation, education, healthcare, vacation;
        double fairTaxRate = 0.23;

        System.out.print("Enter your housing expenses: ");
        housing = input.nextDouble();

        System.out.print("Enter your food expenses: ");
        food = input.nextDouble();

        System.out.print("Enter your clothing expenses: ");
        clothing = input.nextDouble();

        System.out.print("Enter your transportation expenses: ");
        transportation = input.nextDouble();

        System.out.print("Enter your education expenses: ");
        education = input.nextDouble();

        System.out.print("Enter your healthcare expenses: ");
        healthcare = input.nextDouble();

        System.out.print("Enter your vacation expenses: ");
        vacation = input.nextDouble();

        double totalExpenses = housing + food + clothing + transportation + education + healthcare + vacation;
        double fairTax = totalExpenses * fairTaxRate;

        System.out.printf("The estimated FairTax you would pay is: $%.2f%n", fairTax);

        input.close();
    }
}
