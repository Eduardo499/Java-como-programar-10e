package ex29;
import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho;

        System.out.print("Digite o tamanho do quadrado (1 a 20): ");
        tamanho = input.nextInt();

        if (tamanho < 1 || tamanho > 20) {
            System.out.println("Tamanho inválido.");
            input.close();
            return;
        }
        else {
            for (int i = 1; i <= tamanho; i++) {
                for (int j = 1; j <= tamanho; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        input.close();
    }
}
