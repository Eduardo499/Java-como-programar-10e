import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número de 5 dígitos: ");
        numero = input.nextInt();

        if (numero >= 10000 && numero <= 99999) {
            int digito1 = numero / 10000;
            int digito2 = numero / 1000 % 10;
            int digito3 = numero / 100 % 10;
            int digito4 = numero / 10 % 10;
            int digito5 = numero % 10;

            String sdigito1 = Integer.toString(digito1);
            String sdigito2 = Integer.toString(digito2);
            String sdigito3 = Integer.toString(digito3);
            String sdigito4 = Integer.toString(digito4);
            String sdigito5 = Integer.toString(digito5);

            String n1 = sdigito1 + sdigito2 + sdigito3 + sdigito4 + sdigito5;
            String n2 = sdigito5 + sdigito4 + sdigito3 + sdigito2 + sdigito1;

            if (n1.equals(n2)) {
                System.out.println("Esse número é um palíndromo.");
            }
            else {
                System.out.println("Esse número não é um palíndromo.");
            }
        }
        else {
            System.out.println("Esse número não tem cinco dígitos.");
        }



        input.close();

    }
}