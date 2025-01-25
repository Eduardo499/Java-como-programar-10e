package ex13;

public class Fatorial {
    public static long fatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static void main(String[] args) {
        System.out.println("Número\tFatorial");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d\t%d%n", i, fatorial(i));
        }
    }
}
