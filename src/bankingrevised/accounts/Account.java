package bankingrevised.accounts;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    String accountName;
    String accountNumber;
    double accountBalance;

    List<String> listOfTransactions = new ArrayList<>();


    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void addAccountTransaction(String transaction) {
        listOfTransactions.add(transaction);
    }

    public List<String> getAllTransactions(){
        return this.listOfTransactions;
    }
}
