package ex08;

public class TaxaEstacionamento {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(2);
        Cliente cliente2 = new Cliente(4);
        Cliente cliente3 = new Cliente(23);

        System.out.printf("O Cliente1 ficou %d horas no estacionamento e pagou %.2f reais %n", cliente1.getHoras(), calculateCharges(cliente1.getHoras()));
        System.out.printf("O Cliente2 ficou %d horas no estacionamento e pagou %.2f reais %n", cliente2.getHoras(), calculateCharges(cliente2.getHoras()));
        System.out.printf("O Cliente3 ficou %d horas no estacionamento e pagou %.2f reais %n", cliente3.getHoras(), calculateCharges(cliente3.getHoras()));

    }
    public static double calculateCharges(int horas) {
        if (horas <= 3) {
            return 2.0;
        }
        else if (horas > 3) {
            return 2.0 + 0.5 * (horas - 3);
        }
        else if (horas <= 24) {
            return 10.0;
        }
        return 0.0;
    }
}
