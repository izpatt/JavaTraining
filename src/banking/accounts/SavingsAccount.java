package banking.accounts;

public class SavingsAccount extends Account {

    private double maintainingBalance;
    private double interest;

    public SavingsAccount(double accountBalance, double maintainingBalance, double interest) {
        this.accountBalance = accountBalance;
        this.maintainingBalance = maintainingBalance;
        this.interest = interest;
    }
    public Double getAccountBalance() {
        return accountBalance * interest;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getMaintainingBalance() {
        return maintainingBalance;
    }

}
