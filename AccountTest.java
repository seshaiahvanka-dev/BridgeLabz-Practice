package DAY11_12;

public class AccountTest {
    // Inner Account class
    static class Account {
        private double balance;

        // Constructor
        public Account(double initialBalance) {
            if (initialBalance >= 0.0) {
                balance = initialBalance;
            } else {
                balance = 0.0;
                System.out.println("Initial balance was invalid. Set to 0.0");
            }
        }

        // Method to add money
        public void credit(double amount) {
            balance += amount;
        }

        // Method to withdraw money safely
        public void debit(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Debit successful. New balance: " + balance);
            } else {
                System.out.println("Debit amount exceeded account balance.");
            }
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }
    }

    // Main method to test Account
    public static void main(String[] args) {
        Account account1 = new Account(1000.0);  // Initial balance

        System.out.println("Initial Balance: " + account1.getBalance());

        // Test debit with valid amount
        account1.debit(400.0);  // Should succeed

        // Test debit with amount greater than balance
        account1.debit(700.0);  // Should fail

        // Test debit with exact balance
        account1.debit(600.0);  // Should succeed

        // Final balance check
        System.out.println("Final Balance: " + account1.getBalance());
    }
}
