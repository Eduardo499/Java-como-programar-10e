package ex36;

public class TrianguloRetangulo {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Triângulo retângulo.");
            }
            else {
                System.out.println("Não é um triângulo retângulo.");
            }
        }
        else {
            System.out.println("Não é um triângulo.");
        }
    }
}
