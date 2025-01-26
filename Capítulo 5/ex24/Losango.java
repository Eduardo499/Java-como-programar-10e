package ex24;

public class Losango {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i == 10) {
                for (int k = 1; k <= 10; k++) {
                    for (int l = 1; l <= k; l++) {
                        System.out.print(" ");
                    }
                    for (int l = 1; l <= 10 - k; l++) {
                        System.out.print("*");
                    }
                    for (int l = 1; l <= 10 - k; l++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
