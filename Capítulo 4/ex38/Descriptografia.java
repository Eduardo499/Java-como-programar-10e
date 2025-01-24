package ex38;
import java.util.Scanner;

public class Descriptografia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 4 dígitos: ");
        int numero = input.nextInt();

        int descriptografado = descriptografar(numero);

        System.out.println("Número descriptografado: " + descriptografado);

        input.close();
    }
    public static int descriptografar(int numero) {
        int digito1 = numero / 1000;
        int digito2 = (numero % 1000) / 100;
        int digito3 = (numero % 100) / 10;
        int digito4 = numero % 10;

        digito1 = (digito1 + 3) % 10;
        digito2 = (digito2 + 3) % 10;
        digito3 = (digito3 + 3) % 10;
        digito4 = (digito4 + 3) % 10;

        return digito3 * 1000 + digito4 * 100 + digito1 * 10 + digito2;
    }
}
