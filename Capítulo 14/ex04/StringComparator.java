package ex04;

import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita as strings do usuário
        System.out.print("Digite a primeira string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Digite a segunda string: ");
        String str2 = scanner.nextLine();
        
        // Solicita o índice inicial e o número de caracteres para comparar
        System.out.print("Digite o índice inicial para comparação: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Digite o número de caracteres a serem comparados: ");
        int length = scanner.nextInt();
        
        // Compara as strings usando regionMatches ignorando maiúsculas e minúsculas
        boolean resultado = str1.regionMatches(true, startIndex, str2, startIndex, length);
        
        // Exibe o resultado da comparação
        if (resultado) {
            System.out.println("As partes das strings são iguais.");
        } else {
            System.out.println("As partes das strings são diferentes.");
        }
        
        scanner.close();
    }
}
