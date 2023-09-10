package banking;

import banking.accounts.CheckingAccount;
import banking.accounts.CreditAccount;
import banking.accounts.SavingsAccount;
import banking.transaction.Credit;
import banking.transaction.Transfer;
import banking.transaction.Withdrawal;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount("Patricia Anne", "CA081820", 100000.00D, 10000.00D, "Pag-Ibig Fund", "Ten thousand pesos only");
        System.out.println(checkingAccount);

        SavingsAccount savingsAccount = new SavingsAccount(100000.00D, 10000.00D, 0.05);
        //System.out.println(savingsAccount);

        CreditAccount creditAccount = new CreditAccount("Pat's Credit Card", "CC081820", 100000.00D);


        Transfer trans = new Transfer(100.00D, savingsAccount, checkingAccount);
        trans.processTransaction();
        System.out.println("Transfer: " + savingsAccount.getAccountBalance());
        System.out.println("Check bal: " + checkingAccount.getAccountBalance());

        Withdrawal with = new Withdrawal(100, savingsAccount);
        with.processTransaction();
        System.out.println("Balance: " + savingsAccount.getAccountBalance());

        Credit creds = new Credit(10000.00D, 500.00D, creditAccount, 500);
        creds.processTransaction();
        System.out.println("Balance: " + creditAccount.getAccountBalance());


    }
}
