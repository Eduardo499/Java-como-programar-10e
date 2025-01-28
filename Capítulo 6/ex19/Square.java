package ex19;

public class Square {
    public static void main(String[] args) {
        squareOfAsteristks(20, '$');
    }
    public static void squareOfAsteristks(int side, char character) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(character);
            }
            System.out.println();
        }

    }
}
