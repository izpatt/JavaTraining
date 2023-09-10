package bank;

import java.util.List;

public class Withdraw extends Transactions {

    public double withdrawableAmount;
    private List<CheckingAccount> myTransactions;

    public List<CheckingAccount> addCheckTransactions(CheckingAccount checkingAccount) {
        myCheckAccountTransactions.add(checkingAccount);
        return myCheckAccountTransactions;
    }
    public List<CreditAccount> addCreditTransactions(CreditAccount creditAccount) {
        return myCreditAccountTransactions;
    }
    public List<SavingsAccount> addSavingsTransactions(SavingsAccount savingsAccount) {
        return mySavingsAccountTransactions;
    }
    public void generateStatement() {

    }
}
