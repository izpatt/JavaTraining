package bankingrevised.transaction;

import bankingrevised.accounts.SavingsAccount;

import java.time.LocalDate;

public class SavingsWithdrawal extends Withdrawal {

    public SavingsWithdrawal(double amountTransaction, SavingsAccount account, LocalDate dateTime) {
        super(amountTransaction, account, dateTime);
    }

    @Override
    protected boolean validateAmount() {
        if(!super.validateAmount()) {
            return false;
        }
        if(account.getAccountBalance() < ((SavingsAccount) account).getMaintainingBalance()) {
            System.out.println("Account is charged with P100 penalty fee");
        }
        return true;
    }


    @Override
    protected void postProcessAccountDeduction() {
        super.postProcessAccountDeduction();
        if(account.getAccountBalance() < ((SavingsAccount) account).getMaintainingBalance()){
            toAccountBalance -= 100;
            account.setAccountBalance( account.getAccountBalance() - 100);
            listOfTransactions.add("\n Penalty fee: 100" );
        }
    }
}
