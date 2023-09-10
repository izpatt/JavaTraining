package bank;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        CheckingAccount checkAccount = new CheckingAccount("CA081820", "Patricia Anne Valenzuela",
                "PagIbig Fund", 50000.00D, 500000.00D);

        SavingsAccount savingsAccount = new SavingsAccount("CA081820", "Patricia Anne Valenzuela", 50000.00D);

        System.out.println(checkAccount);

        Transfer transferToMyCheckingAccount = new Transfer(100.00D, checkAccount);
        System.out.println(transferToMyCheckingAccount.getMyCurrentBalanceNow(checkAccount));
        System.out.println(checkAccount.balance);

        Transfer transferToMySavingsAccount = new Transfer(100.00D, savingsAccount);
        System.out.println(transferToMySavingsAccount.getMyCurrentBalanceNow(savingsAccount));
        System.out.println(savingsAccount.balance);
//        Transfer transferToSavingsAccount = new Transfer(100.00D, "SavingsAccount");
//        System.out.println(transferToSavingsAccount.getMyCurrentBalanceNow());
//
//        transferToSavingsAccount.add(new Transfer(100.00D, "SavingsAccount"));
//        transferToSavingsAccount.add(new Transfer(100.00D, "SavingsAccount"));

//
//        Transfer transferToCreditAccount = new Transfer(100.00D, "CreditAccount");
//        System.out.println(transferToCreditAccount.getMyCurrentBalanceNow());
//
//        transferToSavingsAccount.generateStatement();
        //System.out.println(transferToMyCheckingAccount.);




    }
}

