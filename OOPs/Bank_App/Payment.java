package BankApp;

import BankApp.CreditCardPayment;
import BankApp.DebitCardPayment;

public sealed interface Payment
    permits CreditCardPayment, DebitCardPayment, UPIPayment {

    void makePayment(double amount);
    void makeRefund(double amount);
}
