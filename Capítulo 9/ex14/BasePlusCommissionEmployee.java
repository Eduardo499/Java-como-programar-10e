package ex14;

// Subclasse BasePlusCommissionEmployee
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // Salário base por semana

    // Construtor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate); // Chama o construtor da superclasse
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Salário base deve ser >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // Métodos getter e setter
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Salário base deve ser >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // Método para calcular os ganhos
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // Método toString que chama o toString da superclasse
    @Override
    public String toString() {
        return String.format("%s%nSalário Base: %.2f", super.toString(), baseSalary);
    }
}
