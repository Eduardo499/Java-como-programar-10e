package ex20;

import java.util.Scanner;

public class Vendas {
    private static final int[][] sales = new int[5][4];
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite as vendas do último mês (vendedor, produto, valor), ou -1 para finalizar:");
        while (true) {
            System.out.print("Número do vendedor (1-4) ou -1 para sair: ");
            int vendedor = scanner.nextInt();
            if (vendedor == -1) break;

            System.out.print("Número do produto (1-5): ");
            int produto = scanner.nextInt();

            System.out.print("Valor total vendido: ");
            int valor = scanner.nextInt();

            if (vendedor >= 1 && vendedor <= 4 && produto >= 1 && produto <= 5) {
                sales[produto - 1][vendedor - 1] += valor;
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }

        exibirResumo();
    }
    private static void exibirResumo() {
        System.out.println("\nResumo das Vendas:");
        System.out.printf("%-15s%-10s%-10s%-10s%-10s%-10s\n", "Produto", "V1", "V2", "V3", "V4", "Total");
        int[] totalPorVendedor = new int[4];
        int totalGeral = 0;

        for (int i = 0; i < 5; i++) {
            int totalProduto = 0;
            System.out.printf("Produto %-8d", (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-10d", sales[i][j]);
                totalProduto += sales[i][j];
                totalPorVendedor[j] += sales[i][j];
            }
            System.out.printf("%-10d\n", totalProduto);
            totalGeral += totalProduto;
        }

        System.out.printf("%-15s", "Total Vendedor");
        for (int total : totalPorVendedor) {
            System.out.printf("%-10d", total);
        }
        System.out.printf("%-10d\n", totalGeral);
    }
}
