package ex24;

public class Main {

    public static void main(String[] args) {
        // Limite superior para encontrar números perfeitos
        int limite = 1000; // Ajuste o limite para testar números maiores

        // Verifica e exibe todos os números perfeitos entre 1 e limite
        for (int i = 1; i <= limite; i++) {
            if (NumberUtils.isPerfect(i)) {
                System.out.println(i + " é um número perfeito. Fatores: " + getFatores(i));
            }
        }
    }

    // Método para obter os fatores de um número
    public static String getFatores(int number) {
        StringBuilder fatores = new StringBuilder();

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                fatores.append(i).append(" ");
            }
        }

        return fatores.toString().trim();
    }
}