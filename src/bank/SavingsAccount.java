package bank;

public class SavingsAccount extends Account {

    private double minimumBalance = 10000.00D;
    private double interestRate = 0.05;
    private double interestEarnings;
    private double deduction;
    private double savingsAccountBalance = 900000.00D; //balance in account

    public double getSavingsAccountBalance() {
        return savingsAccountBalance;
    }

    public SavingsAccount() {

    }
    public SavingsAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getInterestEarnings() {
        return interestEarnings;
    }

    public double getDeduction() {
        return deduction;
    }

}
