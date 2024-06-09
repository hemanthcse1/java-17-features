package sealedclasses.example;

public final class CheckingAccount extends BankAccount{
    protected double overdraftLimit;

    public CheckingAccount(String accountNumber, double amount, double overdraftLimit){
        super(accountNumber, amount);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

}
