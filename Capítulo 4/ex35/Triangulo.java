package ex35;

public class Triangulo {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero.");
            }
            else if (a == b || a == c || b == c) {
                System.out.println("Triângulo isósceles.");
            }
            else {
                System.out.println("Triângulo escaleno.");
            }
        }
        else {
            System.out.println("Não é um triângulo.");
        }
    }
}
