public class Invoice {
    private String number;
    private String description;
    private int qty;
    private double price; 

    public Invoice(String number, String description, int qty, double price) {
        this.number = number;
        this.description = description;

        if (qty < 0)
            this.qty = 0;
        else
            this.qty = qty;
        
        if (price < 0)    
            this.price = 0;
        else
            this.price = price;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public double getInvoiceAmount() {
        return qty * price;
    }
}
