package ex15;

public class Rational {
    private int numerator;
    private int denominator;

    // Construtor sem argumento, com valor padrão 0/1
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Construtor com argumentos, inicializa a fração e reduz para a forma simplificada
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        int gcd = gcd(numerator, denominator); // Encontrar o maior divisor comum (GCD)
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
        if (this.denominator < 0) { // Manter o sinal no numerador
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // Método para encontrar o maior divisor comum (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Método static para somar dois números Rational
    public static Rational add(Rational r1, Rational r2) {
        int numerator = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int denominator = r1.denominator * r2.denominator;
        return new Rational(numerator, denominator);
    }

    // Método static para subtrair dois números Rational
    public static Rational subtract(Rational r1, Rational r2) {
        int numerator = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int denominator = r1.denominator * r2.denominator;
        return new Rational(numerator, denominator);
    }

    // Método static para multiplicar dois números Rational
    public static Rational multiply(Rational r1, Rational r2) {
        int numerator = r1.numerator * r2.numerator;
        int denominator = r1.denominator * r2.denominator;
        return new Rational(numerator, denominator);
    }

    // Método static para dividir dois números Rational
    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        int numerator = r1.numerator * r2.denominator;
        int denominator = r1.denominator * r2.numerator;
        return new Rational(numerator, denominator);
    }

    // Representação em string da fração na forma a/b
    public String toFractionString() {
        return numerator + "/" + denominator;
    }

    // Representação em string como número de ponto flutuante
    public String toDecimalString(int precision) {
        double decimalValue = (double) numerator / denominator;
        return String.format("%." + precision + "f", decimalValue);
    }

    // Método principal para testar a classe Rational
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);

        // Teste das operações
        System.out.println("r1: " + r1.toFractionString()); // 2/3
        System.out.println("r2: " + r2.toFractionString()); // 3/4

        Rational sum = Rational.add(r1, r2);
        System.out.println("Soma: " + sum.toFractionString()); // 17/12

        Rational difference = Rational.subtract(r1, r2);
        System.out.println("Subtração: " + difference.toFractionString()); // -1/12

        Rational product = Rational.multiply(r1, r2);
        System.out.println("Multiplicação: " + product.toFractionString()); // 6/12 (simplificado para 1/2)

        Rational quotient = Rational.divide(r1, r2);
        System.out.println("Divisão: " + quotient.toFractionString()); // 8/9

        // Teste de representação decimal com precisão
        System.out.println("r1 (decimal, 2 casas): " + r1.toDecimalString(2)); // 0.67
        System.out.println("r2 (decimal, 3 casas): " + r2.toDecimalString(3)); // 0.750
    }
}
