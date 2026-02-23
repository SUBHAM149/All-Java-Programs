package BankApp;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount = 0;

        // ----------- BILL AMOUNT INPUT -----------
        while (true) {
            try {
                System.out.print("Enter your total bill Amount: ");
                amount = Double.parseDouble(sc.nextLine());
                if (amount <= 0) {
                    System.out.println("Amount must be greater than 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount! Please enter a valid number.");
            }
        }

        ShoppingCart cart = new ShoppingCart(amount);

        // ----------- PAYMENT CHOICE INPUT -----------
        int choice = 0;

        while (true) {
            try {
                System.out.println("\nChoose Payment Method:");
                System.out.println("1. Credit Card");
                System.out.println("2. Debit Card");
                System.out.println("3. UPI");
                System.out.print("Enter your choice: ");

                choice = Integer.parseInt(sc.nextLine());

                if (choice < 1 || choice > 3) {
                    System.out.println("Please select a valid option (1-3).");
                    continue;
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Enter numbers only.");
            }
        }

        Payment payment = null;

        // ----------- PAYMENT DETAILS INPUT -----------
        switch (choice) {

            case 1:
                System.out.print("Enter Credit Card Holder Name: ");
                String cardHolder = sc.nextLine();

                System.out.print("Enter Credit Card Number: ");
                String cardNumber = sc.nextLine();

                System.out.print("Enter CVV: ");
                String cvv = sc.nextLine();

                payment = new CreditCardPayment(cardHolder, cardNumber, cvv);
                break;

            case 2:
                System.out.print("Enter Bank Name: ");
                String bankName = sc.nextLine();

                System.out.print("Enter Debit Card Number: ");
                String debitCardNumber = sc.nextLine();

                System.out.print("Enter PIN: ");
                String pin = sc.nextLine();

                payment = new DebitCardPayment(bankName, debitCardNumber, pin);
                break;

            case 3:
                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();

                payment = new UPIPayment(upiId);
                break;
        }

        // ----------- CHECKOUT -----------
        cart.checkout(payment);

        // ----------- CANCEL & REFUND -----------
        cart.cancelOrder(payment);

        sc.close();
    }
}
