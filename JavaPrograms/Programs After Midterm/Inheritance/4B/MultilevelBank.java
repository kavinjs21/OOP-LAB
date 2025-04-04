class Account {
    String accNumber = "ACC123";
    double balance = 10000;

    void displayBalance() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Available Balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate = 0.05;

    void applyInterest() {
        balance += balance * interestRate;
        System.out.println("Interest Applied. New Balance: ₹" + balance);
    }
}

class Customer extends SavingsAccount {
    void customerDetails() {
        System.out.println("Customer Name: Riya Sharma");
        System.out.println("Account Type: Savings");
    }
}

public class MultilevelBank {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.customerDetails();
        c.displayBalance();
        c.applyInterest();
    }
}
