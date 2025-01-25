package ex16;
import java.util.Scanner;

public class GraficoBarras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = new int[5];

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            valores[i - 1] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d: ", i + 1);
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
