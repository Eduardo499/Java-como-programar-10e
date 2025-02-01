package ex14;

public class Produto {
    public static void main(String[] args) {
        System.out.println(produto(1, 2, 3, 4, 5));
    }
    public static int produto(int... numeros) {
        int product = 1;

        for (int num : numeros)
            product *= num;

        return product;
    }
}
