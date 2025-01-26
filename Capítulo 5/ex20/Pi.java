package ex20;

public class Pi {
    public static void main(String[] args) {
        double pi = 0;
        int n = 1000000;
        for (int i = 1; i <= n; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        pi *= 4;
        System.out.println("Pi: " + pi);
    }
}
