package TASK3.Question2;

public class Product implements Taxable {
	private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public double calcTax() {
        return price * salesTax * quantity;
    }
}
