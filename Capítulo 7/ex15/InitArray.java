public class InitArray {
   public static void main(String[] args) {
       // Definir tamanho do array com base no argumento da linha de comando
       int tamanho = 10; // Valor padrão

       if (args.length > 0) { // Verifica se há um argumento
           try {
               tamanho = Integer.parseInt(args[0]); // Converte o argumento para inteiro
               if (tamanho <= 0) {
                   System.out.println("O tamanho do array deve ser um número positivo. Usando padrão (10).");
                   tamanho = 10;
               }
           } catch (NumberFormatException e) {
               System.out.println("Entrada inválida. Usando tamanho padrão (10).");
           }
       }

       int[] array = new int[tamanho]; // Criando o array com o tamanho especificado

       System.out.printf("%s%8s%n", "Index", "Value");

       for (int counter = 0; counter < array.length; counter++)
           System.out.printf("%5d%8d%n", counter, array[counter]);
   }
}
