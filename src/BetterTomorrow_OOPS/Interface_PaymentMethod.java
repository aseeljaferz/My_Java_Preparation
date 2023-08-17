package BetterTomorrow_OOPS;
import java.util.*;


interface Payment {
    void processPayment(double amount);
}

class CashPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of amount: " + amount);
    }
}

class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of amount: " + amount);
    }
}

public class Interface_PaymentMethod {
 public static void main(String[] args) {
	 double amount = 100.0;

     Payment cashPayment = new CashPayment();
     cashPayment.processPayment(amount);

     String cardNumber = "1234567890123456";
     String cardHolderName = "John Doe";
     String expiryDate = "12/25";

     Payment creditCardPayment = new CreditCardPayment(cardNumber, cardHolderName, expiryDate);
     creditCardPayment.processPayment(amount);
 }
}
