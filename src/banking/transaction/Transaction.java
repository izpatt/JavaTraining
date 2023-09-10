package banking.transaction;

import java.time.LocalDateTime;

public abstract class Transaction {

    LocalDateTime dateOfTransaction;
    public double amountTransaction;
    public double toAccountBalance;

    public abstract void processTransaction();
    public abstract Double computeAccountBalance();
    //processTransaction
    //computeAccountBalance
//    verifyValidTransaction
//	computeCurrentBalance
}
