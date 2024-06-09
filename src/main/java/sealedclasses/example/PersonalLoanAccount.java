package sealedclasses.example;

public final class PersonalLoanAccount extends LoanAccount {

    public PersonalLoanAccount(String accountNumber, double amount, double interestRate){
        super(accountNumber, amount, interestRate);
    }
}
