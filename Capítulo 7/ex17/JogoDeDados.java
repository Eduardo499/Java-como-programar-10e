package ex17;

import java.util.Random;

public class JogoDeDados {
    public static void main(String[] args) {
        int numeroDeLancamentos = 36_000_000;
        
        int[] contagemSomas = new int[13];

        Random random = new Random();

        for (int i = 0; i < numeroDeLancamentos; i++) {
            int dado1 = random.nextInt(6) + 1; 
            int dado2 = random.nextInt(6) + 1; 
            int soma = dado1 + dado2; 
            contagemSomas[soma]++; 
        }

        System.out.println("Soma | Quantidade de Ocorrências");
        System.out.println("----------------------------");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%4d  | %d%n", i, contagemSomas[i]);
        }
    }
}
