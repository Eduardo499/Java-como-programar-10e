package ex21;

public class NumberUtils {

    // Método para exibir os dígitos de um número separados por dois espaços
    public static void displayDigits(int numero) {
        // Verifica se o número está no intervalo especificado
        if (numero < 1 || numero > 99999) {
            System.out.println("Número fora do intervalo permitido (1 a 99999).");
            return;
        }

        // Converte o número para string para facilitar a separação dos dígitos
        String numeroStr = String.valueOf(numero);

        // Exibe cada dígito separado por dois espaços
        for (char digito : numeroStr.toCharArray()) {
            System.out.print(digito + "  ");
        }
        System.out.println(); // Para pular uma linha após a exibição dos dígitos
    }
}