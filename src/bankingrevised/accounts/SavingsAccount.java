package bankingrevised.accounts;

public class SavingsAccount extends Account {

    private double maintainingBalance;
    private double interest;
    private double interestEarnings;

    public SavingsAccount(String accountName, String accountNumber, double accountBalance, double maintainingBalance, double interest) {
        super.accountName = accountName;
       // this.accountName = accountName;
        super.accountNumber = accountNumber;
        super.accountBalance = accountBalance;
        this.maintainingBalance = maintainingBalance;
        this.interest = interest;
    }

    private Double setInterestEarnings() {
        return accountBalance * 0.05;
    }

    public double getMaintainingBalance() {
        return maintainingBalance;
    }



    @Override
    public String toString() {
        return this.accountNumber + " \t" + this.accountName + " \t" + (String.format("%,.2f", this.accountBalance)) + " \t Maintaining Balance: " + this.maintainingBalance +  " \t Interest: " + interest +  " \t Interest Earnings: " + (String.format("%,.2f", this.setInterestEarnings()));

    }
}
