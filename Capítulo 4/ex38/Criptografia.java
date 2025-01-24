package ex38;
import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 4 dígitos: ");
        int numero = input.nextInt();

        int criptografado = criptografar(numero);

        System.out.println("Número criptografado: " + criptografado);

        input.close();
    }
    public static int criptografar(int numero) {
        int digito1 = numero / 1000;
        int digito2 = (numero % 1000) / 100;
        int digito3 = (numero % 100) / 10;
        int digito4 = numero % 10;

        digito1 = (digito1 + 7) % 10;
        digito2 = (digito2 + 7) % 10;
        digito3 = (digito3 + 7) % 10;
        digito4 = (digito4 + 7) % 10;

        return digito3 * 1000 + digito4 * 100 + digito1 * 10 + digito2;
    }
}
