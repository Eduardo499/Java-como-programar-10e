package ex21;

public class NumerosPitagoricos {
    public static void main(String[] args) {
        System.out.printf("%s%20s%20s%20s%n", "Lado 1", "Lado 2", "Hipotenusa", "Resultado");
        for (int lado1 = 1; lado1 <= 500; lado1++) {
            for (int lado2 = 1; lado2 <= 500; lado2++) {
                for (int hipotenusa = 1; hipotenusa <= 500; hipotenusa++) {
                    if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(hipotenusa, 2)) {
                        System.out.printf("%4d%20d%20d%20s%n", lado1, lado2, hipotenusa, "Pitagorico");
                    }
                }
            }
        }
    }
}
