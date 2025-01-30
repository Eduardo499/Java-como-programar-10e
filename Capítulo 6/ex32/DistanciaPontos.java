package ex32;

public class DistanciaPontos {
    public static void main(String[] args) {
        System.out.println(distance(2,3,6,1));
    }
    public static double distance(double aX, double aY, double bX, double bY) {
        return Math.sqrt(Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2));
    }
}
