package ex15;

public class Hipotenusa {
    public static void main(String[] args) {
        System.out.println(hypotenuse(3,4));
    }
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    }
}
