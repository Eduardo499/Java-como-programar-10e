package ex27;

public class Mdc {
    public static void main(String[] args) {
        System.out.println(mdc(20,24));
    }
    public static int mdc(int num1, int num2) {
        while (num1 % num2 > 0) {
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        } 
        return num2;
        }
    }
