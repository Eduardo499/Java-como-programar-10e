package ex17;

public class ParOuImpar {
    public static void main(String[] args) {
        System.out.println(isEven(3));
    }
    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        return false;
    }
}
