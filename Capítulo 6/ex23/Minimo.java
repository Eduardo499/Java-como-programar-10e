package ex23;

public class Minimo {
    public static void main(String[] args) {
        System.out.println(minimum3(1.1, 1.01, 1.001));
        
    }
    public static double minimum3(double n1, double n2, double n3) {
        return Math.min(Math.min(n1, n2), n3);
    }
}