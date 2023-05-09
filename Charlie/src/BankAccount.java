public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String n, double bal) {
        name = n;
        balance = bal;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    @Override
    public String toString() {
        String balanceStr;
        if (balance % 1 == 0) {
            balanceStr = String.format("%.1f", balance);
        } else {
            balanceStr = String.format("%.2f", balance);
        }
        return name + " ($" + balanceStr + ")";
    }

}
