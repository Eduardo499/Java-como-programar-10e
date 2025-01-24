package ex39;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        long populacao = 8000000000L;

        double crescimento = 0.09 / 100;
        int anos = 75;

        System.out.println("População\tAno");

        for (int i = 0; i < anos; i++) {
            populacao += populacao * crescimento;
            System.out.println(populacao + "\t" + (2025 + i));
        }


    }
}
