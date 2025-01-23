package ex20;
import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioHora, horasTrabalhadas, salarioBruto;

        System.out.print("Digite o valor do salário por hora: ");
        salarioHora = input.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = input.nextDouble();

        while (salarioHora != -1) {
            if (horasTrabalhadas <= 40) {
                salarioBruto = salarioHora * horasTrabalhadas;
            } else {
                salarioBruto = (salarioHora * 40) + ((horasTrabalhadas - 40) * (salarioHora * 1.5));
            }

            System.out.printf("Salário bruto: R$%.2f\n\n", salarioBruto);

            System.out.print("Digite o valor do salário por hora: ");
            salarioHora = input.nextDouble();
            System.out.print("Digite a quantidade de horas trabalhadas: ");
            horasTrabalhadas = input.nextDouble();
        }

        input.close();
    }
}
