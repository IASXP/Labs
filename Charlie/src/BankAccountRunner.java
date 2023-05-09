import java.util.Scanner;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("McCoy", 1000000);
        BankAccount account2 = new BankAccount("Jim", 600.45);
        BankAccount account3 = new BankAccount("Bob", 0.32);

        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        while (choice.equals("y")) {
            // Display menu options
            System.out.println("(1) Deposit Funds");
            System.out.println("(2) Withdraw Cash");

            // Get user choice
            System.out.print("What would you like to do? >>> ");
            int option = scanner.nextInt();

            // Display account list
            System.out.println("\n(1) " + account1.toString());
            System.out.println("(2) " + account2.toString());
            System.out.println("(3) " + account3.toString());

            // Get selected account
            System.out.print("Select an account >>> ");
            int accountNumber = scanner.nextInt();
            BankAccount selectedAccount = null;
            if (accountNumber == 1) {
                selectedAccount = account1;
            } else if (accountNumber == 2) {
                selectedAccount = account2;
            } else if (accountNumber == 3) {
                selectedAccount = account3;
            }

            // Perform deposit or withdrawal
            if (option == 1) {
                System.out.print("\nEnter amount >>> $");
                double amount = scanner.nextDouble();
                selectedAccount.deposit(amount);
                System.out.println("Deposit successful. Account details: " + selectedAccount.toString());
            } else if (option == 2) {
                System.out.print("\nEnter amount >>> $");
                double amount = scanner.nextDouble();
                selectedAccount.withdraw(amount);
                System.out.println("Withdrawal successful. Account details: " + selectedAccount.toString());
            }

            // Prompt for another transaction
            System.out.print("Perform another transaction? (y/n) >>> ");
            choice = scanner.next();
        }
    }
}
