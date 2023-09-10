package banking.transaction;


import banking.accounts.CreditAccount;

public class Credit extends Transaction {

    private double creditLimit;
    private double penalty;
    private CreditAccount accountType;


    public Credit(double creditLimit, double amountTransaction, CreditAccount account, double penalty) {
        this.creditLimit = creditLimit;
        this.amountTransaction = amountTransaction;
        this.toAccountBalance = account.getAccountBalance();
        this.accountType = account;
        this.penalty = penalty;
    }

    public void processTransaction() {
        if(accountType.getAccountBalance() > amountTransaction) {
            System.out.println(" >>> Transaction Successful <<< ");
            computeAccountBalance();
        } else {
            System.out.println(" >>> Transaction Unsuccessful <<< ");
        }
    }

    public Double computeAccountBalance() {

        if(accountType.getAccountBalance() > amountTransaction) {
            toAccountBalance -= amountTransaction;
            if(accountType.getAccountBalance() < creditLimit) {
                toAccountBalance -= penalty;
            }
        }
        accountType.setAccountBalance(toAccountBalance);
        return toAccountBalance;
    }

}
