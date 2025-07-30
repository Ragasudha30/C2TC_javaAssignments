package Assignment5;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(",");
        String stageEvent = input[0];
        String customer = input[1];
        Integer noOfSeats = Integer.parseInt(input[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                Double amountCash = Double.parseDouble(sc.nextLine());
                booking.makePayment(amountCash);
                break;
            case 2:
                Double amountWallet = Double.parseDouble(sc.nextLine());
                String walletNumber = sc.nextLine();
                booking.makePayment(amountWallet, walletNumber);
                break;
            case 3:
                String holderName = sc.nextLine();
                Double amountCredit = Double.parseDouble(sc.nextLine());
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, amountCredit, cardType, ccv);
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
