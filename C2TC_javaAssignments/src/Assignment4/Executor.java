package Assignment4;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());
        double costPerHour = Double.parseDouble(sc.nextLine());

        Airfare flight = null;

        switch (choice) {
            case 1:
                flight = new AirIndia(hours, costPerHour);
                break;
            case 2:
                flight = new KingFisher(hours, costPerHour);
                break;
            case 3:
                flight = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Round to 2 decimal places and print
        double amount = flight.calculateAmount();
        System.out.printf("%.2f\n", amount);
    }
}

