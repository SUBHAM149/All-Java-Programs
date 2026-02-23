package BankApp;

import BankApp.Payment;


	public final class UPIPayment implements Payment {

	    private String upiId;

	    public UPIPayment(String upiId) {
	        this.upiId = upiId;
	    }

	    @Override
	    public void makePayment(double amount) {
	        System.out.println("Paid RS " + amount + " using UPI ID : " + upiId);
	    }

	    @Override
	    public void makeRefund(double amount) {
	        System.out.println("Refunded RS " + amount + " to UPI ID : " + upiId);
	    }
	}


