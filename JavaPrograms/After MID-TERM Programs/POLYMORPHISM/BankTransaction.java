class Transaction {
    void perform() {
        System.out.println("Performing a generic transaction...");
    }
}

class Withdrawal extends Transaction {
    @Override
    void perform() {
        System.out.println("Withdrawing ₹2000 from ATM.");
    }
}

class Deposit extends Transaction {
    @Override
    void perform() {
        System.out.println("Depositing ₹5000 into savings account.");
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Transaction tx1 = new Withdrawal();
        Transaction tx2 = new Deposit();

        tx1.perform();
        tx2.perform();
    }
}
