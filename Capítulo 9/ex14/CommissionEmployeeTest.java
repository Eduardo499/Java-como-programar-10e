package ex14;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
                "Carlos", "Silva", "111-11-1111", 5000, 0.05);

        System.out.println("Informações do funcionário comissionado:");
        System.out.println(employee);
        System.out.println("Ganhos: " + employee.earnings());
    }
}
