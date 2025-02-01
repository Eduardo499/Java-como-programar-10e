package ex16;

public class Soma {
    public static void main(String[] args) {
        double[] numeros = new double[args.length];
        for (int i = 0; i < args.length; i++)
            numeros[i] = Double.parseDouble(args[i]);
            
        System.out.println(soma(numeros));
    }
    public static double soma(double... numeros) {
        double total = 0.0;

        for (double numero : numeros)
            total += numero;

        return total;
    }
}