package banking.accounts;

public class CreditAccount extends Account {

    private double creditLimit;

    public CreditAccount(String accountName, String accountNumber, double accountBalance, double creditLimit) {
        super.accountName = accountName;
        super.accountNumber = accountNumber;
        super.accountBalance = accountBalance;
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public String toString() {
        return this.accountNumber + " \t" + this.accountName + " \t" + (String.format("%,.2f", this.accountBalance)) +
                " \tLimit: " + this.creditLimit;

    }



}
