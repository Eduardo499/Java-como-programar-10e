import javax.swing.JOptionPane;

public class Addition 
{
   public static void main(String[] args)
   {  
      int sum = 0;
      try {
         String number1 = JOptionPane.showInputDialog("Enter first integer: "); 
         String number2 = JOptionPane.showInputDialog("Enter second integer: "); 
         sum = Integer.parseInt(number1) + Integer.parseInt(number2);
         String message = String.format("The sum is %d", sum);
         JOptionPane.showMessageDialog(null, message);
      }
       catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Error! The numbers must be integers.");
      }
   } 
}
