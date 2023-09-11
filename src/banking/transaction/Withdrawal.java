package banking.transaction;

import banking.accounts.Account;
import banking.accounts.CheckingAccount;
import banking.accounts.SavingsAccount;
import java.time.LocalDate;

public class Withdrawal extends Transaction {

    private Account accountType;

    public Withdrawal(double amountTransaction, Account accountType, LocalDate dateTime) {
        this.amountTransaction = amountTransaction;
        this.toAccountBalance = accountType instanceof CheckingAccount ?
                ((CheckingAccount) accountType).getAccountBalance() : ((SavingsAccount) accountType).getAccountBalance();
        this.accountType = accountType;
        this.dateOfTransaction = dateTime;
    }

    public void processTransaction() {

        if(toAccountBalance >= amountTransaction) {
            System.out.println(">>> Transaction Successful: Amount withdrawed <<< \n" +
                    "Current " + accountType.getClass().getSimpleName() + " Balance: " + toAccountBalance + "\nTo Withdraw: " + amountTransaction);
            if(toAccountBalance < ((SavingsAccount) accountType).getMaintainingBalance()) {
                System.out.println("Account is charged with P100 penalty fee");
            }
        }
        else {
            System.out.println(">>> Transaction Failed: Insufficient Balance <<< \n" +
                    "Current Balance: " + toAccountBalance + "\nTo Transfer: " + amountTransaction);
        }
        computeAccountBalance();
    }

    public Double computeAccountBalance() {

        if (accountType instanceof CheckingAccount && toAccountBalance > amountTransaction) {
            toAccountBalance -= amountTransaction;
            ((CheckingAccount) accountType).setAccountBalance(toAccountBalance);
            listOfTransactions.add(dateOfTransaction + " Withdrawed " + amountTransaction + " from " + accountType.getClass().getSimpleName());
        } else if (accountType instanceof SavingsAccount && toAccountBalance > amountTransaction){
            toAccountBalance -= amountTransaction;
            listOfTransactions.add(dateOfTransaction + " Withdrawed " + amountTransaction + " from " + accountType.getClass().getSimpleName());

            if(toAccountBalance < ((SavingsAccount) accountType).getMaintainingBalance()){
                toAccountBalance -= 100;
                listOfTransactions.add("\n Penalty fee: 100" );
            }
            ((SavingsAccount) accountType).setAccountBalance(toAccountBalance);
        }
        return toAccountBalance;
    }


}
