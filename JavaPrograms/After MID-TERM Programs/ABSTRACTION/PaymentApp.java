abstract class Payment {
    abstract void makePayment(double amount);

    void paymentSuccess() {
        System.out.println("Payment completed successfully.");
    }
}

class CreditCardPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.makePayment(2000);
        p.paymentSuccess();
    }
}
