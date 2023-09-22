package bankingrevised;

import bankingrevised.accounts.CheckingAccount;
import bankingrevised.accounts.CreditAccount;
import bankingrevised.accounts.SavingsAccount;
import bankingrevised.transaction.Credit;
import bankingrevised.transaction.SavingsWithdrawal;
import bankingrevised.transaction.Transfer;
import bankingrevised.transaction.Withdrawal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount("Patricia Anne", "CA081820", 100000.00D, "Pag-Ibig Fund");
        System.out.println("| Checking Account --------------------------------------------------  \n" + checkingAccount);

        SavingsAccount savingsAccount = new SavingsAccount("Patricia Anne", "SA081820", 100000.00D, 10000.00D, 0.05);
        System.out.println("\n| Savings Account --------------------------------------------------   \n" +savingsAccount);

        CreditAccount creditAccount = new CreditAccount("Pat's Credit Card", "CC081820", 100000.00D, 10000.00D);
        System.out.println("\n| Credit Account --------------------------------------------------  \n" +creditAccount + "\n");

        //LIST OF TRANSACTIONS
        System.out.println(" -------------------------------------------------- TRANSACTIONS --------------------------------------------------");
        Transfer transferSavingsToCheckUnsuccessful = new Transfer(5000000.00D, savingsAccount, checkingAccount, LocalDate.now());
        transferSavingsToCheckUnsuccessful.processTransaction();
        System.out.println(transferSavingsToCheckUnsuccessful.getListOfTransactions());
        System.out.println("Savings Balance: " + savingsAccount.getAccountBalance());
        System.out.println("Checking Balance: " + checkingAccount.getAccountBalance());

        Transfer transferSavingsToCheck = new Transfer(100.00D, savingsAccount, checkingAccount, LocalDate.now());
        transferSavingsToCheck.processTransaction();
        System.out.println(transferSavingsToCheck.getListOfTransactions());
        System.out.println("Savings Balance: " + savingsAccount.getAccountBalance());
        System.out.println("Checking Balance: " + checkingAccount.getAccountBalance());



        System.out.println(" -------------------------------------------------- TRANSACTIONS --------------------------------------------------");
        Withdrawal withdrawal = new SavingsWithdrawal(100, savingsAccount, LocalDate.now());
        withdrawal.processTransaction();
        System.out.println(withdrawal.getListOfTransactions());
        System.out.println("Savings Balance: " + savingsAccount.getAccountBalance());

        Withdrawal withdrawalUnsuccessful = new SavingsWithdrawal(99000, savingsAccount, LocalDate.now());
        withdrawalUnsuccessful.processTransaction();
        System.out.println(savingsAccount.getAllTransactions());
        System.out.println("Savings Balance: " + savingsAccount.getAccountBalance());


        System.out.println(" -------------------------------------------------- TRANSACTIONS --------------------------------------------------");
        Credit swipeCreditCard = new Credit( 500.00D, creditAccount, 500, LocalDate.now());
        swipeCreditCard.processTransaction();
        System.out.println(swipeCreditCard.getListOfTransactions());
        System.out.println("Credit Balance: " + creditAccount.getAccountBalance());

        Credit swipeCreditCardUnsuccessful = new Credit( 500000.00D, creditAccount, 500, LocalDate.now());
        swipeCreditCardUnsuccessful.processTransaction();
        System.out.println(swipeCreditCardUnsuccessful.getListOfTransactions());
        System.out.println("Credit Balance: " + creditAccount.getAccountBalance());

        Credit swipeCreditCardPenalty = new Credit( 95000.00D, creditAccount, 500, LocalDate.now());
        swipeCreditCardPenalty.processTransaction();
        System.out.println(swipeCreditCardPenalty.getListOfTransactions());
        System.out.println("Credit Balance: " + creditAccount.getAccountBalance());

        Withdrawal withdrawal1 = new Withdrawal(100, checkingAccount, LocalDate.now());
        withdrawal1.processTransaction();
        System.out.println(withdrawal1.getListOfTransactions());
        System.out.println("Checking Balance: " + checkingAccount.getAccountBalance());
    }
}
