package ex03;

import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita as strings do usuário
        System.out.print("Digite a primeira string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Digite a segunda string: ");
        String str2 = scanner.nextLine();
        
        // Compara as strings
        int resultado = str1.compareTo(str2);
        
        // Exibe o resultado da comparação
        if (resultado < 0) {
            System.out.println("A primeira string é menor que a segunda.");
        } else if (resultado > 0) {
            System.out.println("A primeira string é maior que a segunda.");
        } else {
            System.out.println("As duas strings são iguais.");
        }
        
        scanner.close();
    }
}
