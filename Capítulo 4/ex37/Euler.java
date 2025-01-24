package ex37;

public class Euler {
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
    public static void main(String[] args) {
        double euler = 0;
        for (int i = 0; i < 10; i++) {
            euler += 1.0 / fatorial(i);
        }
        System.out.println("O número de Euler é " + euler);
    }
}
