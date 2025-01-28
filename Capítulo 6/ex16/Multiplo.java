package ex16;

public class Multiplo {
    public static void main(String[] args) {
        System.out.println(isMultiple(17, 3));
        
    }
    public static boolean isMultiple(int a, int b) {
        if (b % a == 0)
            return true;
        return false;
    }
}
