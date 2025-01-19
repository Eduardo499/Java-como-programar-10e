import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n1 = input.nextInt();

        System.out.print("Digite outro número: ");
        n2 = input.nextInt();

        if (n1 % n2 == 0) {
            System.out.printf("%d é mútilplo de %d%n", n1, n2);
        }
        else if (n2 % n1 == 0) {
            System.out.printf("%d é mútilplo de %d%n", n2, n1);
        } 
        else {
            System.out.println("Esses números não são múltiplos entre si");
        }

        input.close();
    }
}