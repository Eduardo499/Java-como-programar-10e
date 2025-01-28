package ex20;

public class Area {
    public static void main(String[] args) {
        System.out.println(circleArea(2));
    }
    public static double circleArea(double radius) {
        return radius * radius * Math.PI;
    }
}
