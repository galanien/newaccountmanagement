import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, "Deposit"));
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) throws I_BalanceEx {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                transactions.add(new Amount(amount, "Withdrawal"));
                System.out.println("Withdrawal successful. New balance: $" + balance);
            } else {
                throw new I_BalanceEx("Insufficient balance. Current balance: $" + balance);
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
