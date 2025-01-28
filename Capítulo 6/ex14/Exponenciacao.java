package ex14;

public class Exponenciacao {
    public static void main(String[] args) {
        System.out.println(integerPower(3, 4));
    }
    public static int integerPower(int a, int b) {
        int product = 1;

        for (int i = 1; i <= b; i++) {
            product *= a;
        }
        return product;
    }
}
