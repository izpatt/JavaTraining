package bankingrevised.transaction;

import bankingrevised.accounts.Account;
import bankingrevised.accounts.CheckingAccount;
import bankingrevised.accounts.SavingsAccount;
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

        if(!validateAmount()) {
            System.out.println(">>> Transaction Failed: Insufficient Balance <<< \n" +
                "Current Balance: " + account.getAccountBalance() + "\nTo Transfer: " + amountTransaction);
            return;
        }
        System.out.println(">>> Transaction Successful: Amount withdrawed <<< \n" +
                    "Current " + account.getClass().getSimpleName() + " Balance: " + account.getAccountBalance() + "\nTo Withdraw: " + amountTransaction);

        computeAccountBalance();

    }

    protected boolean validateAmount(){
        return account.getAccountBalance() > amountTransaction;
    }

    @Override
    protected Double computeAccountBalance() {
        postProcessAccountDeduction();
        account.addAccountTransaction(dateOfTransaction + " Withdrawed " + amountTransaction + " from " + account.getClass().getSimpleName());
        return toAccountBalance;

//        listOfTransactions.add(dateOfTransaction + " Withdrawed " + amountTransaction + " from " + account.getClass().getSimpleName());
//
//        ((SavingsAccount) account).setAccountBalance(toAccountBalance);
//
//        if (account instanceof CheckingAccount && toAccountBalance > amountTransaction) {
//            toAccountBalance -= amountTransaction;
//            ((CheckingAccount) account).setAccountBalance(toAccountBalance);
//            listOfTransactions.add(dateOfTransaction + " Withdrawed " + amountTransaction + " from " + account.getClass().getSimpleName());
//        } else if (account instanceof SavingsAccount && toAccountBalance > amountTransaction){
//            toAccountBalance -= amountTransaction;
//            listOfTransactions.add(dateOfTransaction + " Withdrawed " + amountTransaction + " from " + account.getClass().getSimpleName());
//
//            if(toAccountBalance < ((SavingsAccount) account).getMaintainingBalance()){
//                toAccountBalance -= 100;
//                listOfTransactions.add("\n Penalty fee: 100" );
//            }
//            ((SavingsAccount) account).setAccountBalance(toAccountBalance);
//        }
//        return toAccountBalance;
    }


    protected  void postProcessAccountDeduction(){
        account.setAccountBalance(account.getAccountBalance() - amountTransaction);
    }


}
