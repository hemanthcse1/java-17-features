package sealedclasses.example;

public final class SavingsAccount extends BankAccount{
    protected double interestRate;

    public SavingsAccount(String accountNumber, double amount, double interestRate){
        super(accountNumber,amount);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }


}
