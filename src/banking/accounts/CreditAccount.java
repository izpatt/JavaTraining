package banking.accounts;

public class CreditAccount extends Account {

    private double creditLimit;

    public CreditAccount(String accountName, String accountNumber, double accountBalance, double creditLimit) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return this.accountNumber + " \t" + this.accountName + " \t" + (String.format("%,.2f", this.accountBalance)) + " \tLimit: " + this.creditLimit;

    }



}
