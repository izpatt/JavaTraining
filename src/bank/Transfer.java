package bank;

import java.util.ArrayList;
import java.util.List;

public class Transfer extends Transactions {

    public double transferAmount;
    public double currentBalance;
    public List<Transfer> transferTransactions = new ArrayList<>();

    public Transfer(double transferAmount, Account account) {
        this.transferAmount = transferAmount;
        this.currentBalance = account.balance;
//        this.currentBalance = className.equals("CheckingAccount") ? checkingAccountDetails.getBalance() :
//                className.equals("CreditAccount") ? creditAccountDetails.getCreditAccountBalance() :
//                        savingsAccountDetails.getSavingsAccountBalance();
    }

    public double getMyCurrentBalanceNow(Account account) {
        //double total = transferAmount + currentBalance;
        account.balance = currentBalance + transferAmount;
        return currentBalance + transferAmount;
    }

    public void add(Transfer transfer) {
        transferTransactions.add(transfer);
        System.out.println(transferTransactions.toString());
    }
    public void generateStatement() {
        System.out.println(transferTransactions);
    }
    //Any method for transaction - from & to account, add transac history, validations


}
