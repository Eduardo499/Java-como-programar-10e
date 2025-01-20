public class InvoiceTest {
    public static void main(String[] args) {
        Invoice pen = new Invoice("001", "Pen", 30, 1.5);

        System.out.printf("The amount is %.2f%n", pen.getInvoiceAmount());
    }
}
