package bank;

public class CheckingAccount extends Account {

    private String payeeName;
    private double toPayAmount;

    public CheckingAccount() {

    }

    public CheckingAccount(String accountNumber, String accountName, String payeeName, double toPayAmount, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.payeeName = payeeName;
        this.toPayAmount = toPayAmount;
        this.balance = balance;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public double getToPayAmount() {
        return toPayAmount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return this.accountNumber + " " +
        this.accountName + " " + this.payeeName + " " +
        this.toPayAmount;
    }
}
