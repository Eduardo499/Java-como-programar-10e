import java.math.BigDecimal;
import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args) {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53); 

      // Exibir saldo inicial de cada objeto
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      // Criar um Scanner para obter entrada do usuário
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // Prompt
      double depositAmount = input.nextDouble(); // Obter entrada do usuário
      System.out.printf("%nadding %.2f to account1 balance%n%n", 
         depositAmount);
      // Converta o valor para BigDecimal antes de passar para o método
      account1.deposit(new BigDecimal(String.valueOf(depositAmount))); // Adicionar ao saldo de account1

      // Exibir saldos
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      System.out.print("Enter deposit amount for account2: "); // Prompt
      depositAmount = input.nextDouble(); // Obter entrada do usuário
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         depositAmount);
      // Converta o valor para BigDecimal antes de passar para o método
      account2.deposit(new BigDecimal(String.valueOf(depositAmount))); // Adicionar ao saldo de account2

      // Exibir saldos
      System.out.printf("%s balance: $%.2f%n", 
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      input.close();
   } 
}