package exercicios.ex11_1.entities;

import exercicios.ex11_1.model.Exceptions.AccountException;

public class Account {

    private Integer number;
    private String holder; // proprietário
    private Double balance; // saldo
    private Double withdrawLimit; //limite de saque

    public Account(String name, int num, double bal, double withLim) throws AccountException {
        setNumber(num);
        if (getNumber() <= 0) {
            throw new AccountException("Invalid account number ");
        }
        setHolder(name);
        if (getHolder() == null) {
            throw new AccountException("Holder can't be null");
        }
        setBalance(bal);
        if (getBalance() < 0) {
            throw new AccountException("Balance can't be negative");
        }
        setWithdrawLimit(withLim);
        if (getWithdrawLimit() <= 0) {
            throw new AccountException("Withdraw Limit can't be negative");
        }
    }

    // GETTERS
    private Integer getNumber() { return number; }
    private String getHolder() { return holder; }
    private Double getBalance() { return balance; }
    private Double getWithdrawLimit() { return withdrawLimit; }


    // SETTERS
    private void setNumber(Integer number) { this.number = number; }
    private void setHolder(String holder) { this.holder = holder; }
    private void setBalance(Double balance) { this.balance = balance; }
    private void setWithdrawLimit(Double withdrawLimit) { this.withdrawLimit = withdrawLimit; }


    // METHODS
    public void deposit(double amount) throws AccountException {
        setBalance(getBalance() + amount);
        if (amount <= 0) {
            throw new AccountException("Invalid input");
        }

    }

    public void withdraw(double amount) throws AccountException {
        if (amount > getWithdrawLimit()) {
            throw new AccountException("The value exceeds withdraw limit");
        }
        setBalance(getBalance() - amount);
    }

    @Override
    public String toString() { System.out.printf("New balance = %.2f" , getBalance()); return null; }
}