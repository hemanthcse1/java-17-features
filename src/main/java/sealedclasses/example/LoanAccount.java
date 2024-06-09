package sealedclasses.example;

public sealed class LoanAccount extends BankAccount permits PersonalLoanAccount, BusinessLoanAccount{
    protected double interestRate;

    public LoanAccount(String accountNumber, double amount, double interestRate){
        super(accountNumber, amount);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

}
