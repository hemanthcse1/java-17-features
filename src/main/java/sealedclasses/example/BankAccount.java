package sealedclasses.example;

public sealed class BankAccount permits SavingsAccount,CheckingAccount,LoanAccount{
    protected String accountNumber;
    protected double amount;

    public BankAccount(String accountNumber, double amount){
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAmount(){
        return amount;
    }

    public void deposit(double amount){
        if (amount > 0){
            amount += amount;
        }
    }


}
