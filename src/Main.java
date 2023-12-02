public class Main {
    public static void main(String[] args) {
        try {
            // Sample Usage
            PersonalAccount account = new PersonalAccount(210104053, "Kalybekov Nurdoolot");

            account.deposit(1000.0);
            account.withdraw(900.0);// This will throw an InsufficientBalanceException
            account.deposit(200.0);

            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Current Balance: $" + account.getBalance());

            account.printTransactionHistory();
        } catch (I_BalanceEx e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}