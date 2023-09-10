package bank;

public class CreditAccount extends Account {

    private double creditLimit;

    public CreditAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

}
