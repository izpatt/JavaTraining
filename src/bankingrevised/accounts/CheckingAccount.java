package bankingrevised.accounts;

public class CheckingAccount extends Account {

    private String payeeName;

    public CheckingAccount(String accountName, String accountNumber, double accountBalance, String payeeName) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.payeeName = payeeName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    @Override
    public String toString() {
        return this.accountNumber + " \t" + this.accountName + " \t" +  (String.format("%,.2f", this.accountBalance))  + " \t" + this.payeeName;
    }
}
