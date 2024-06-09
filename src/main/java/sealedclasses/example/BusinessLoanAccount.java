package sealedclasses.example;

public final class BusinessLoanAccount extends LoanAccount{

    public BusinessLoanAccount(String accountNumber, double amount, double interestRate){
        super(accountNumber, amount, interestRate);
    }
}
