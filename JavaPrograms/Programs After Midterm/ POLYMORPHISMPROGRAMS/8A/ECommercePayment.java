interface PaymentGateway {
    void processPayment(double amount);
}

class PayPal implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of ₹" + amount);
    }
}

class Razorpay implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing Razorpay payment of ₹" + amount);
    }
}

public class ECommercePayment {
    public static void main(String[] args) {
        PaymentGateway pg;

        pg = new PayPal();
        pg.processPayment(1500.00);

        pg = new Razorpay();
        pg.processPayment(2999.99);
    }
}
