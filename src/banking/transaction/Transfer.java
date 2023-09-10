package banking.transaction;
import banking.accounts.CheckingAccount;
import banking.accounts.SavingsAccount;

public class Transfer extends Transaction {

    private double fromAccountBalance;
    private SavingsAccount fromAccountObject;
    private CheckingAccount toAccountObject;

    public Transfer(double amountTransaction, SavingsAccount fromAccount, CheckingAccount toAccount) {
        this.amountTransaction = amountTransaction;
        this.fromAccountObject = fromAccount;
        this.toAccountObject = toAccount;
    }

    public void processTransaction() {
        if(fromAccountObject.getAccountBalance() >= amountTransaction) {
            System.out.println(">>> Transaction Successful: Amount is transferred <<< \n" +
                    "Current Balance: " + fromAccountObject.getAccountBalance() + "\nTo Transfer: " + amountTransaction);
            computeAccountBalance();
        } else {
            System.out.println("\n>>> Transaction Failed: Insufficient Balance <<< \n" +
                    "Current Balance: " + fromAccountObject.getAccountBalance() + "\nTo Transfer: " + amountTransaction);
        }
    }

    public Double computeAccountBalance() {
        fromAccountBalance = fromAccountObject.getAccountBalance() - amountTransaction;
        toAccountBalance = toAccountObject.getAccountBalance() + amountTransaction;
        fromAccountObject.setAccountBalance(fromAccountBalance);
        toAccountObject.setAccountBalance(toAccountBalance);

        return toAccountBalance;
    }


}
