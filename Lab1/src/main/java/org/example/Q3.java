package org.example;

import java.util.Date;

public class Q3 {
    public static void main(String[] args) {
        Account p1 = new Account(1122,20000);
        Account.setAnnualInterestRate(4.5);
        p1.withdraw(2500);
        p1.deposit(3000);
        System.out.println("Balance: "+p1.getBalance());
        System.out.println("Monthly interest: "+p1.getMonthlyInterest());
        System.out.println("Date: "+p1.getDateCreated());
    }
}

class Account{
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account(){

    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annInterestRate) {
        annualInterestRate = annInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }


    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate() /100;
    }

    public void withdraw (double m){
        balance = m >= balance? 0 : balance-m;
    }

    public void deposit (double m){
        balance += m;
    }
}

