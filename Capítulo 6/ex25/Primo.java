package ex25;

public class Primo {
    public static void main(String[] args) {
        System.out.println(isPrime(9815923)); 
        primes(1000000);
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    public static void primes(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrime(i))
                System.out.printf("%d ", i);
        }
        System.out.println();
    }
}