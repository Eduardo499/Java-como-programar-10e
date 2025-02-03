package ex27;

public class CrivoEratostenes {

    public static void main(String[] args) {
        int tamanho = 1000; // Definindo o tamanho do array (de 0 a 999)
        boolean[] primos = new boolean[tamanho]; // Array para armazenar a informação se o número é primo ou não

        // Inicializando todos os elementos como 'true', exceto 0 e 1
        for (int i = 2; i < tamanho; i++) {
            primos[i] = true;
        }

        // Aplicando o Crivo de Eratóstenes
        for (int i = 2; i * i < tamanho; i++) {
            if (primos[i]) {
                // Marcando múltiplos de 'i' como 'false'
                for (int j = i * i; j < tamanho; j += i) {
                    primos[j] = false;
                }
            }
        }

        // Exibindo os números primos
        System.out.println("Números primos entre 2 e 999:");
        for (int i = 2; i < tamanho; i++) {
            if (primos[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
