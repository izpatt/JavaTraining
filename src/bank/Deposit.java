package bank;

import java.util.List;

public class Deposit extends Transactions {

    public double depositedAmount;

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
