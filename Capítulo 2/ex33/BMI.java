import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your mass (in kilograms): ");
        double mass = input.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double height = input.nextDouble();

        double bmi = mass / (height * height);

        System.out.printf("Your BMI is %.2f%n", bmi);

        System.out.println();

        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");

        input.close();
    }
}
