package ex10;

import java.util.Random;

public class ComissoesVendas {
    public static void main(String[] args) {
        int[] contadores = new int[9];
        Random rand = new Random();

        for (int i = 1; i < 20; i++) {
            int vendasBrutas = rand.nextInt(14001) + 1000;
            int salario = calcularSalario(vendasBrutas);
            classificarSalario(salario, contadores);
        }

        String[] faixas = {
            "R$ 200–299", "R$ 300–399", "R$ 400–499", "R$ 500–599",
            "R$ 600–699", "R$ 700–799", "R$ 800–899", "R$ 900–999", "R$ 1000 e acima"
        };

        System.out.println("Faixa Salaria | Número de Vendedores");
        System.out.println("-".repeat(32));
        for (int i = 1; i < 9; i++) {
            System.out.printf("%-15s | %d%n", faixas[i], contadores[i]);
        }
    }
    public static int calcularSalario(int vendasBrutas) {
        return (int) (200 + 0.09 * vendasBrutas);
    }
    public static void classificarSalario(int salario, int[] contadores) {
        if (salario >= 1000) {
            contadores[8]++;
        }
        else {
            int indice = (salario - 200) / 100;
            contadores[indice]++;
        }
    }
}
