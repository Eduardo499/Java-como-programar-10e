package ex14;

// Subclasse CommissionEmployee
public class CommissionEmployee extends Employee {
    private double grossSales; // Vendas brutas semanais
    private double commissionRate; // Taxa de comissão

    // Construtor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber); // Chama o construtor da superclasse
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Vendas brutas devem ser >= 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("A taxa de comissão deve estar entre 0 e 1");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // Métodos getter e setter
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Vendas brutas devem ser >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("A taxa de comissão deve estar entre 0 e 1");
        }
        this.commissionRate = commissionRate;
    }

    // Método para calcular os ganhos
    public double earnings() {
        return commissionRate * grossSales;
    }

    // Método toString que chama o toString da superclasse
    @Override
    public String toString() {
        return String.format("%s%nVendas Brutas: %.2f%nTaxa de Comissão: %.2f",
                super.toString(), grossSales, commissionRate);
    }
}
