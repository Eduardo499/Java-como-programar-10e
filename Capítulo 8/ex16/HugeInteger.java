package ex16;

public class HugeInteger {
    private int[] digits = new int[40]; // Array para armazenar até 40 dígitos
    private int size = 0; // Tamanho atual do número (quantidade de dígitos válidos)

    // Método parse para converter uma String em HugeInteger
    public void parse(String str) {
        size = str.length();
        if (size > 40) {
            throw new IllegalArgumentException("Número maior que 40 dígitos.");
        }
        for (int i = 0; i < size; i++) {
            digits[i] = str.charAt(i) - '0'; // Converte cada caractere em um inteiro
        }
    }

    // Método toString para retornar a representação em string do HugeInteger
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(digits[i]);
        }
        return sb.toString();
    }

    // Método para adicionar dois HugeIntegers
    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        int i = size - 1, j = other.size - 1;
        int k = Math.max(size, other.size);  // Iniciando k com o tamanho máximo
    
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += digits[i--];
            if (j >= 0) sum += other.digits[j--];
            result.digits[k] = sum % 10;
            carry = sum / 10;
            k--;  // Decrementa para armazenar no próximo índice
    
            if (k < 0) break;  // Impede que o índice k fique negativo
        }
    
        // Ajuste do tamanho do número resultante
        result.size = Math.max(size, other.size);
        if (carry != 0) {  // Se sobrou um carry extra
            result.digits[result.size++] = carry;
        }
    
        return result;
    }

    // Método para subtrair dois HugeIntegers
    public HugeInteger subtract(HugeInteger other) {
        if (isLessThan(other)) {
            throw new ArithmeticException("Subtração resulta em número negativo.");
        }

        HugeInteger result = new HugeInteger();
        int borrow = 0;
        int i = size - 1, j = other.size - 1;
        int k = size - 1;

        while (i >= 0 || j >= 0) {
            int diff = digits[i] - borrow;
            if (j >= 0) diff -= other.digits[j--];
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[k--] = diff;
            i--;
        }

        result.size = size;
        while (result.size > 1 && result.digits[result.size - 1] == 0) {
            result.size--;
        }

        return result;
    }

    // Métodos de comparação
    public boolean isEqualTo(HugeInteger other) {
        if (size != other.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (digits[i] != other.digits[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger other) {
        return !isEqualTo(other);
    }

    public boolean isGreaterThan(HugeInteger other) {
        if (size > other.size) {
            return true;
        }
        if (size < other.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (digits[i] > other.digits[i]) {
                return true;
            }
            if (digits[i] < other.digits[i]) {
                return false;
            }
        }
        return false;
    }

    public boolean isLessThan(HugeInteger other) {
        return !isGreaterThan(other) && !isEqualTo(other);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return isGreaterThan(other) || isEqualTo(other);
    }

    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return isLessThan(other) || isEqualTo(other);
    }

    // Verifica se o HugeInteger é zero
    public boolean isZero() {
        return size == 0 || (size == 1 && digits[0] == 0);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        HugeInteger num1 = new HugeInteger();
        num1.parse("12345678901234567890123456789012345678");

        HugeInteger num2 = new HugeInteger();
        num2.parse("98765432109876543210987654321098765432");

        System.out.println("Número 1: " + num1.toString());
        System.out.println("Número 2: " + num2.toString());

        // Testando a adição
        HugeInteger sum = num1.add(num2);
        System.out.println("Soma: " + sum.toString());

        // Testando a subtração
        HugeInteger diff = num2.subtract(num1);
        System.out.println("Subtração: " + diff.toString());

        // Testando comparações
        System.out.println("Num1 é igual a Num2? " + num1.isEqualTo(num2));
        System.out.println("Num1 é maior que Num2? " + num1.isGreaterThan(num2));
        System.out.println("Num1 é menor que Num2? " + num1.isLessThan(num2));

        // Verificando o zero
        HugeInteger zero = new HugeInteger();
        System.out.println("Zero é zero? " + zero.isZero());
    }
}
