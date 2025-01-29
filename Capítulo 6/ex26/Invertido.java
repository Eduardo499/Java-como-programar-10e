package ex26;

public class Invertido {
    public static void main(String[] args) {
        inverter(1234);
    }
    public static void inverter(int num) {
        while (num > 0) {
            System.out.print(num % 10);
            num /= 10;
        }
        System.out.println();
    }
}
