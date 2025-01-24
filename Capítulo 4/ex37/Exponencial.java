package ex37;

public class Exponencial {
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

public static double calcularExponencial(int x, int termos) {
    double resultado = 1.0;
    for (int i = 1; i < termos; i++) {
        resultado += Math.pow(x, i) / fatorial(i);
    }
        return resultado;
    }
    
        public static void main(String[] args) {
        int x = 5;
        int termos = 10;
    
        double euler = calcularExponencial(x, termos);
        System.out.println("e^" + x + " = " + euler);
    }
}
