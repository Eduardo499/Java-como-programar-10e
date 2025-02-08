package ex15;

import ex14.Employee;

// Subclasse HourlyEmployee
public class HourlyEmployee extends Employee {
    private double hours; // Horas trabalhadas na semana
    private double wage;  // Salário por hora

    // Construtor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber); // Chama o construtor da superclasse
        setWage(wage);  // Validação dentro do setter
        setHours(hours); // Validação dentro do setter
    }

    // Métodos getter e setter para wage
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("O salário por hora deve ser >= 0.0");
        }
        this.wage = wage;
    }

    // Métodos getter e setter para hours
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("As horas trabalhadas devem estar entre 0 e 168");
        }
        this.hours = hours;
    }

    // Método para calcular os ganhos
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else { // Pagamento de horas extras (50% a mais)
            return (40 * wage) + ((hours - 40) * wage * 1.5);
        }
    }

    // Método toString que chama o toString da superclasse
    @Override
    public String toString() {
        return String.format("%s%nTipo: Hourly Employee%nHoras Trabalhadas: %.2f%nSalário por Hora: %.2f%nGanhos: %.2f",
                super.toString(), hours, wage, earnings());
    }
}
