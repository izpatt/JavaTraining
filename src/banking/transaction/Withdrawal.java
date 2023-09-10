package banking.transaction;

import banking.accounts.Account;
import banking.accounts.CheckingAccount;
import banking.accounts.SavingsAccount;

public class Withdrawal extends Transaction {

    private Account accountType;

    public Withdrawal(double amountTransaction, Account accountType) {
        this.amountTransaction = amountTransaction;
        this.toAccountBalance = accountType instanceof CheckingAccount ?
                ((CheckingAccount) accountType).getAccountBalance() : ((SavingsAccount) accountType).getAccountBalance();
        this.accountType = accountType;
    }

    public void processTransaction() {
        computeAccountBalance();
        if(toAccountBalance >= amountTransaction) {
            System.out.println(">>> Transaction Successful: Amount withdrawed <<< \n" +
                    "Current Balance: " + toAccountBalance + "\nTo Transfer: " + amountTransaction);
            if(toAccountBalance < ((SavingsAccount) accountType).getMaintainingBalance()) {
                System.out.println("Account is charged with P100 penalty fee");
            }
        }
        else {
            System.out.println(">>> Transaction Failed: Insufficient Balance <<< \n" +
                    "Current Balance: " + toAccountBalance + "\nTo Transfer: " + amountTransaction);
        }

    }

    public Double computeAccountBalance() {

        if (accountType instanceof CheckingAccount && toAccountBalance > amountTransaction) {
            toAccountBalance -= amountTransaction;
            ((CheckingAccount) accountType).setAccountBalance(toAccountBalance);
        } else if (accountType instanceof SavingsAccount && toAccountBalance > amountTransaction){

            toAccountBalance -= amountTransaction;
            if(toAccountBalance < ((SavingsAccount) accountType).getMaintainingBalance()){
                toAccountBalance -= - 100;
            }
            ((SavingsAccount) accountType).setAccountBalance(toAccountBalance);
        }
        return toAccountBalance;
    }


}
