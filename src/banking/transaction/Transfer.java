package banking.transaction;
import banking.accounts.CheckingAccount;
import banking.accounts.SavingsAccount;
import java.time.LocalDate;

public class Transfer extends Transaction {

    private double fromAccountBalance;
    private SavingsAccount fromAccountObject;
    private CheckingAccount toAccountObject;

    public Transfer(double amountTransaction, SavingsAccount fromAccount, CheckingAccount toAccount, LocalDate dateTime) {
        this.amountTransaction = amountTransaction;
        this.fromAccountObject = fromAccount;
        this.toAccountObject = toAccount;
        this.dateOfTransaction = dateTime;
    }

    public void processTransaction() {
        if(fromAccountObject.getAccountBalance() >= amountTransaction) {
            System.out.println(">>> Transaction Successful: Amount is transferred <<< \n" +
                    "Current Savings Balance: " + fromAccountObject.getAccountBalance() +
                    "\nCurrent Check Balance: " + toAccountObject.getAccountBalance() +
                    "\nTo Transfer: " + amountTransaction);
            computeAccountBalance();
        } else {
            System.out.println("\n>>> Transaction Failed: Insufficient Balance <<< \n" +
                    "Current Balance: " + fromAccountObject.getAccountBalance() + "\nTo Transfer: " + amountTransaction);
            listOfTransactions.add(dateOfTransaction + " Failed Transfer " + amountTransaction + " from Savings to Checking Account");
        }
    }

    protected Double computeAccountBalance() {
        fromAccountBalance = fromAccountObject.getAccountBalance() - amountTransaction;
        toAccountBalance = toAccountObject.getAccountBalance() + amountTransaction;
        fromAccountObject.setAccountBalance(fromAccountBalance);
        toAccountObject.setAccountBalance(toAccountBalance);
        listOfTransactions.add(dateOfTransaction + " Transferred " + amountTransaction + " from Savings to Checking Account");
        return toAccountBalance;
    }


}
