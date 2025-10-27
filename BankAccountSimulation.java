public class BankAccountSimulation {

    private String accountHolderName;
    private double balance;

    public BankAccountSimulation(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccountSimulation account = new BankAccountSimulation("Saravana Kumar", 5000);
        account.displayBalance();
        account.deposit(2000);
        account.withdraw(1500);
        account.displayBalance();
    }
}
