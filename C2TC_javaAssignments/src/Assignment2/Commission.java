package Assignment2;

import java.util.Scanner;

public class Commission {
    String name;
    String address;
    String phone;
    double salesAmount;

    // Method to accept employee details
    public void employeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        name = sc.nextLine();

        System.out.println("Enter Address:");
        address = sc.nextLine();

        System.out.println("Enter Phone Number:");
        phone = sc.nextLine();

        System.out.println("Enter Sales Amount:");
        salesAmount = sc.nextDouble();
    }

    // Method to calculate and print commission
    public void calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 50000) {
            commission = 0.05 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.03 * salesAmount;
        } else {
            commission = 0;
        }

        System.out.println("Commission for " + name + "is Rs. " + commission);
    }
}
