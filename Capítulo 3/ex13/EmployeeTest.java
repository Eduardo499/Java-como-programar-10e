package ex13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee john = new Employee("John", "James", 150000);
        Employee jane = new Employee("Jane", "Green", 100000);

        System.out.printf("%s annual salary is %.2f%n", john.getName(), john.getSalary());
        System.out.printf("%s annual salary is %.2f%n%n", jane.getName(), jane.getSalary());

        double newSalary1 = john.getSalary() * 1.10;
        double newSalary2 = jane.getSalary() * 1.10;

        john.setSalary(newSalary1);
        jane.setSalary(newSalary2);

        System.out.printf("%s new annual salary is %.2f%n", john.getName(), john.getSalary());
        System.out.printf("%s annual salary is %.2f%n", jane.getName(), jane.getSalary());
    }
}
