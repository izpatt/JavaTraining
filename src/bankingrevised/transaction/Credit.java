package bankingrevised.transaction;

import bankingrevised.accounts.CreditAccount;
import java.time.LocalDate;

public class Credit extends Transaction {

    private double penalty;
    private CreditAccount accountType;

    public Credit(double amountTransaction, CreditAccount account, double penalty, LocalDate dateOfTransaction) {
        super.amountTransaction = amountTransaction;
        this.toAccountBalance = account.getAccountBalance();
        this.accountType = account;
        this.penalty = penalty;
        this.dateOfTransaction = dateOfTransaction;
    }

    public void processTransaction() {
        if(accountType.getAccountBalance() > amountTransaction) {
            System.out.println(" >>> Transaction Successful: Swiped Credit Card <<< \n" +
                    "Current Credit Account Balance: " + toAccountBalance +
                    "\nTo Pay: " + amountTransaction
            );
            computeAccountBalance();
        } else {
            System.out.println(" >>> Transaction Unsuccessful <<< ");
            listOfTransactions.add(dateOfTransaction + " Swiped " + amountTransaction + " from " + accountType.getClass().getSimpleName());

        }
    }

    protected Double computeAccountBalance() {

        if(accountType.getAccountBalance() > amountTransaction) {
            toAccountBalance -= amountTransaction;
            listOfTransactions.add(dateOfTransaction + " Swiped " + amountTransaction + " from " + accountType.getClass().getSimpleName());

            if(toAccountBalance < accountType.getCreditLimit()) {
                toAccountBalance -= penalty;
                listOfTransactions.add("Penalty " + penalty);
            }

        }
        accountType.setAccountBalance(toAccountBalance);
        return toAccountBalance;
    }

}
