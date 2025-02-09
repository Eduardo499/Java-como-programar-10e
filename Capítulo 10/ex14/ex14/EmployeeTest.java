package ex14;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        
        employees[0] = new HourlyEmployee("John", "Doe", "111-11-1111", new Date(1, 1, 1), 15.0, 40);
        employees[1] = new BasePlusCommissionEmployee("Jane", "Smith", "222-22-2222", new Date(1, 1,1 ), 5000, 0.04, 300);
        employees[2] = new PieceWorker("Bob", "Brown", "333-33-3333", new Date(1,1,1), 2.0, 500);
        employees[3] = new PieceWorker("Alice", "White", "444-44-4444", new Date(1,1,1), 1.5, 600);

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.printf("Earnings: $%,.2f%n", employee.earnings());
            System.out.println("--------------------");
        }
    }
}