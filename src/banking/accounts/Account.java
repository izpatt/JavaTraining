package banking.accounts;

public abstract class Account {

    String accountName;
    String accountNumber;
    double accountBalance;

    public abstract void setAccountBalance(double accountBalance);
    public abstract Double getAccountBalance();
}
