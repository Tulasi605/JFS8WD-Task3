package TASK3.Question2;

public class Product implements Taxable {
	private int pid;
    private double price;
    private int quantity;

    // Constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Implementing calcTax method for sales tax calculation
    public double calcTax() {
        return price * salesTax * quantity;
    }
}
