class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("Kavin");
        account.deposit(10000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: ₹" + account.getBalance());
    }
}
