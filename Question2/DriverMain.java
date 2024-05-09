package TASK3.Question2;

import java.util.Scanner;

public class DriverMain {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee Name:");
        String empName = scanner.nextLine();
        System.out.println("Enter Employee Salary:");
        double empSalary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);

        System.out.println("Income Tax for Employee " + empName + " is: " + employee.calcTax());

        System.out.println("\nEnter Product ID:");
        int pid = scanner.nextInt();
        System.out.println("Enter Product Price:");
        double price = scanner.nextDouble();
        System.out.println("Enter Product Quantity:");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);

        System.out.println("Sales Tax for Product " + pid + " is: " + product.calcTax());

        scanner.close();
    }
}
