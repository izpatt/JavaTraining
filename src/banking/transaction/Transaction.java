package banking.transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Transaction {

    LocalDate dateOfTransaction;
    public double amountTransaction;
    public double toAccountBalance;
    List<String> listOfTransactions = new ArrayList<>();

    public List<String> getListOfTransactions() {
        return listOfTransactions;
    }

    public abstract void processTransaction();
    protected abstract Double computeAccountBalance();

}
