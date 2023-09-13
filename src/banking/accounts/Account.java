package banking.accounts;

public abstract class Account {

    String accountName;
    String accountNumber;
    double accountBalance;

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

//    public abstract void setAccountBalance(double accountBalance);
//    public abstract Double getAccountBalance();
}
