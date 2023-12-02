public class Main {
    public static void main(String[] args) {
        // Create a new PersonalAccount
        PersonalAccount account = new PersonalAccount(12345, "John Doe");

        // Deposit and withdraw money
        account.deposit(1000.0);
        account.withdraw(500.0);
        account.deposit(200.0);

        // Print transaction history and current balance
        account.printTransactions();
    }
}