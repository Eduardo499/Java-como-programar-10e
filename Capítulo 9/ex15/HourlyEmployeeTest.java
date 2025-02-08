package ex15;

// Programa de teste para HourlyEmployee
public class HourlyEmployeeTest {
    public static void main(String[] args) {
        // Criando um funcionário horista
        HourlyEmployee employee = new HourlyEmployee("João", "Pereira", "333-33-3333", 20.0, 45);

        // Exibindo os dados do funcionário
        System.out.println("Informações do funcionário horista:");
        System.out.println(employee);
    }
}
