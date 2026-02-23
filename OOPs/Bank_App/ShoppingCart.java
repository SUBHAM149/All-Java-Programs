package BankApp;

import BankApp.Payment;

public class ShoppingCart {

    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void checkout(Payment payment) {
        System.out.println("Starting checkout for amount RS :" + totalAmount);
        payment.makePayment(totalAmount);   // Dynamic Polymorphism
    }

    public void cancelOrder(Payment payment) {
        System.out.println("\nOrder Canceled. Initiating Refund...");
        System.out.println("Cancelling order for amount RS :" + totalAmount);
        payment.makeRefund(totalAmount);    // Dynamic Polymorphism
    }
}
