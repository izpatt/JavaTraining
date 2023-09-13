package banking.transaction;

import banking.accounts.SavingsAccount;

import java.time.LocalDate;

public class SavingsWithdrawal extends Withdrawal {

    public SavingsWithdrawal(double amountTransaction, SavingsAccount account, LocalDate dateTime) {
        super(amountTransaction, account, dateTime);
    }

    @Override
    public void processTransaction() {
        super.processTransaction();
        if(account.getAccountBalance() < ((SavingsAccount) account).getMaintainingBalance()) {
            System.out.println("Account is charged with P100 penalty fee");
        }
    }
}
