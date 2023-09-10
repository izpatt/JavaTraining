package bank;

import java.util.List;

public abstract class Transactions extends Account {

    public List<CheckingAccount> myCheckAccountTransactions;
    public List<CreditAccount> myCreditAccountTransactions;
    public List<SavingsAccount> mySavingsAccountTransactions;

//    public abstract double getMyCurrentBalanceNow();
//    public abstract void generateStatement();
//
//    public abstract List<CheckingAccount> addCheckTransactions(CheckingAccount checkingAccount);
//    public abstract List<SavingsAccount> addSavingsTransactions(SavingsAccount savingsAccount);
//    public abstract List<CreditAccount> addCreditTransactions(CreditAccount creditAccount);


}
