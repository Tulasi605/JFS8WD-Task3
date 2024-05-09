package TASK3.Question2;

public class Employee implements Taxable {
	 private int empId;
	    private String name;
	    private double salary;

	    // Constructor
	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	    }

	    // Implementing calcTax method for income tax calculation
	    public double calcTax() {
	        return salary * incomeTax;
	    }
}
