import java.util.Scanner;
import java.lang.Math;

public class Circulo {
    public static void main(String[] args) {
        int raio;
        double pi;
        Scanner input = new Scanner(System.in);

        pi = Math.PI;

        System.out.print("Insira o valor do raio: ");
        raio = input.nextInt();
        
        System.out.printf("Diâmetro = %d%n", (2 * raio));
        System.out.printf("Circuferência = %.2f%n", (2 * pi * raio));
        System.out.printf("Área = %.2f%n", (pi * raio * raio));

        input.close();
    }  
}
