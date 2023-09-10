package banking.accounts;

public class CheckingAccount extends Account {

    private String payeeName;
    private String amountInWords;

    public CheckingAccount(String accountName, String accountNumber, double accountBalance, double amountToTransact, String payeeName, String amountInWords) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.amountToTransact = amountToTransact;
        this.payeeName = payeeName;
        this.amountInWords = amountInWords;
    }

    //Getter for Inherited Variables
    public Double getAccountBalance() {
        return accountBalance;
    }

    public Double getAmountToTransact() {
        return amountToTransact;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    //Getter-Setter for Instance variables
    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getAmountInWords() {
        return amountInWords;
    }

    public void setAmountInWords(String amountInWords) {
        this.amountInWords = amountInWords;
    }

    @Override
    public String toString() {
        return this.accountNumber + " \t" + this.accountName + " \t" + this.accountBalance + " \t" + this.amountToTransact + " \t" + this.amountInWords + " \t" + this.payeeName;

//        this.accountBalance = accountBalance;
//        this.amountToTransact = amountToTransact;
//        this.payeeName = payeeName;
//        this.amountInWords = amountInWords;
        //return super.toString();
    }
}
