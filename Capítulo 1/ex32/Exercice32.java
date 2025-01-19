import java.util.Scanner;

public class Exercice32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int n1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        int n2 = input.nextInt();

        System.out.print("Insira o terceiro número: ");
        int n3 = input.nextInt();

        System.out.print("Insira o quarto número: ");
        int n4 = input.nextInt();

        System.out.print("Insira o quinto número: ");
        int n5 = input.nextInt();

        int cont_n = 0;
        int cont_p = 0;
        int cont_z = 0;

        if (n1 < 0) {
            cont_n = cont_n + 1;
        }
        else if (n1 > 0) {
            cont_p = cont_p + 1;
        }
        else if (n1 == 0) {
            cont_z = cont_z + 1;
        }

        if (n2 < 0) {
            cont_n = cont_n + 1;
        }
        else if (n2 > 0) {
            cont_p = cont_p + 1;
        }
        else if (n2 == 0) {
            cont_z = cont_z + 1;
        }

        if (n3 < 0) {
            cont_n = cont_n + 1;
        }
        else if (n3 > 0) {
            cont_p = cont_p + 1;
        }
        else if (n3 == 0) {
            cont_z = cont_z + 1;
        }

        if (n4 < 0) {
            cont_n = cont_n + 1;
        }
        else if (n4 > 0) {
            cont_p = cont_p + 1;
        }
        else if (n4 == 0) {
            cont_z = cont_z + 1;
        }

        if (n5 < 0) {
            cont_n = cont_n + 1;
        }
        else if (n5 > 0) {
            cont_p = cont_p + 1;
        }
        else if (n5 == 0) {
            cont_z = cont_z + 1;
        }
        
        System.out.println();

        System.out.printf("Você inseriu %d números negativos.%n", cont_n);
        System.out.printf("Você inseriu %d números positivos.%n", cont_p);
        System.out.printf("Você inseriu %d números 0s.%n", cont_z);

        input.close();
    }
}