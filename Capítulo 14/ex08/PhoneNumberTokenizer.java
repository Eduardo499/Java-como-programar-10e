package ex08;

import java.util.Scanner;

public class PhoneNumberTokenizer {

    public static void main(String[] args) {
        // Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phone number in the format (555) 555-5555: ");
        String phoneNumber = scanner.nextLine();

        // Remover os caracteres não numéricos para facilitar a tokenização
        String cleanedPhoneNumber = phoneNumber.replaceAll("[^0-9]", "");

        // Dividir a string em três partes
        String areaCode = cleanedPhoneNumber.substring(0, 3);  // Código de área
        String firstPart = cleanedPhoneNumber.substring(3, 6); // Primeiros três dígitos
        String secondPart = cleanedPhoneNumber.substring(6);   // Últimos quatro dígitos

        // Concatenar os sete dígitos
        String fullPhoneNumber = firstPart + secondPart;

        // Exibir os resultados
        System.out.println("Area code: " + areaCode);
        System.out.println("Phone number: " + firstPart + "-" + secondPart);
        System.out.println("Full phone number (concatenated): " + fullPhoneNumber);

        scanner.close();
    }
}
