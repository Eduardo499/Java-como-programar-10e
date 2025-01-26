package ex33;

public class FacebookCrescimento {
    public static void main(String[] args) {
        int usuarios = 1_000_000_000;
        int meses = 0;

        while (usuarios <= 2_000_000_000) {
            usuarios += usuarios * 0.04;
            meses++;
        }

        System.out.println("O Facebook atingiu 1 bilhão de usuários em " + meses + " meses.");
    }
}
