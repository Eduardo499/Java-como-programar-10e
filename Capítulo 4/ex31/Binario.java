package ex31;

public class Binario {
    public static int toNumber(int binary) {
        int decimal = 0;
        int power = 0;
        while (binary != 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int binary = 1101;
        int decimal = toNumber(binary);
        System.out.println(decimal);
    }
}