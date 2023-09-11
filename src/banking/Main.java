package banking;

import banking.accounts.CheckingAccount;
import banking.accounts.CreditAccount;
import banking.accounts.SavingsAccount;
import banking.transaction.Credit;
import banking.transaction.Transfer;
import banking.transaction.Withdrawal;

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
        Withdrawal withdrawal = new Withdrawal(100, savingsAccount, LocalDate.now());
        withdrawal.processTransaction();
        System.out.println(withdrawal.getListOfTransactions());
        System.out.println("Savings Balance: " + savingsAccount.getAccountBalance());

        Withdrawal withdrawalUnsuccessful = new Withdrawal(99000, savingsAccount, LocalDate.now());
        withdrawalUnsuccessful.processTransaction();
        System.out.println(withdrawalUnsuccessful.getListOfTransactions());
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
    }
}
