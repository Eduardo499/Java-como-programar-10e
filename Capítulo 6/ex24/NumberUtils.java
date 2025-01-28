package ex24;

public class NumberUtils {

    // Método para verificar se um número é perfeito
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Encontra todos os fatores de number (exceto o próprio número)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Verifica se a soma dos fatores é igual ao número
        return sum == number;
    }
}