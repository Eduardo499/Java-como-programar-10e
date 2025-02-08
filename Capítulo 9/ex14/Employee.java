package ex14;

// Superclasse Employee
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Construtor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Métodos getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("%s %s%nNúmero do Seguro Social: %s", firstName, lastName, socialSecurityNumber);
    }
}
