package ex14;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Ana", "Souza", "222-22-2222", 4000, 0.04, 300);

        System.out.println("Informações do funcionário comissionado com salário base:");
        System.out.println(employee);
        System.out.println("Ganhos: " + employee.earnings());
    }
}
