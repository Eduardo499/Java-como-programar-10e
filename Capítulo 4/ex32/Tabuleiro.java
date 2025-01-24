package ex32;

public class Tabuleiro {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x <= 8) {
            while (y <= 8) {
                System.out.print("* ");
                System.out.print(" ");
                y++;
            }
            y = 0;
            System.out.println();
            x++;
        }
    }
}
