package ex12;

public class ProdutoImpares {
    public static void main(String[] args) {
    int produto = 1;
    
    for (int i = 1; i <= 15; i += 2) {
        produto *= i;
    }
    System.out.println("O produto dos números ímpares de 1 a 15 é " + produto);
    }
}
