package banking.transaction;

import banking.accounts.Account;
import banking.accounts.CheckingAccount;
import banking.accounts.SavingsAccount;
import java.time.LocalDate;

public class Withdrawal extends Transaction {

    protected Account account;

    //Savings Withdrawal
    public Withdrawal(double amountTransaction, Account account, LocalDate dateTime) {
        super.amountTransaction = amountTransaction;
 //       this.toAccountBalance = accountType.getAccountBalance();
//                accountType instanceof CheckingAccount ?
//                ((CheckingAccount) accountType).getAccountBalance() : ((SavingsAccount) accountType).getAccountBalance();
        this.account = account;
        super.dateOfTransaction = dateTime;
    }

    private boolean validateWithdrawal() {
        return account.getAccountBalance() > amountTransaction;
    }


    @Override
    public void processTransaction() {

        //Trap all criteria / possibilities
        if(account.getAccountBalance() < amountTransaction) {
            System.out.println(">>> Transaction Failed: Insufficient Balance <<< \n" +
                    "Current Balance: " + account.getAccountBalance() + "\nTo Transfer: " + amountTransaction);
            return;
        }

        System.out.println(">>> Transaction Successful: Amount withdrawed <<< \n" +
                    "Current " + account.getClass().getSimpleName() + " Balance: " + account.getAccountBalance() + "\nTo Withdraw: " + amountTransaction);

            computeAccountBalance();

//        if(account.getAccountBalance() >= amountTransaction) {
//            System.out.println(">>> Transaction Successful: Amount withdrawed <<< \n" +
//                    "Current " + account.getClass().getSimpleName() + " Balance: " + account.getAccountBalance() + "\nTo Withdraw: " + amountTransaction);
//            if(account.getAccountBalance() < ((SavingsAccount) account).getMaintainingBalance()) {
//                System.out.println("Account is charged with P100 penalty fee");
//            }
//            computeAccountBalance();
//        }
//        else {
//            System.out.println(">>> Transaction Failed: Insufficient Balance <<< \n" +
//                    "Current Balance: " + account.getAccountBalance() + "\nTo Transfer: " + amountTransaction);
//        }

    }

    @Override
    protected Double computeAccountBalance() {

        if (account instanceof CheckingAccount && toAccountBalance > amountTransaction) {
            toAccountBalance -= amountTransaction;
            ((CheckingAccount) account).setAccountBalance(toAccountBalance);
            listOfTransactions.add(dateOfTransaction + " Withdrawed " + amountTransaction + " from " + account.getClass().getSimpleName());
        } else if (account instanceof SavingsAccount && toAccountBalance > amountTransaction){
            toAccountBalance -= amountTransaction;
            listOfTransactions.add(dateOfTransaction + " Withdrawed " + amountTransaction + " from " + account.getClass().getSimpleName());

            if(toAccountBalance < ((SavingsAccount) account).getMaintainingBalance()){
                toAccountBalance -= 100;
                listOfTransactions.add("\n Penalty fee: 100" );
            }
            ((SavingsAccount) account).setAccountBalance(toAccountBalance);
        }

        return toAccountBalance;
    }


}
