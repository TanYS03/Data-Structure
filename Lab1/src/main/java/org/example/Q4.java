package org.example;
import java.util.ArrayList;
import  java.util.Date;

public class Q4 {
    public static void main(String[] args) {
        Account1.setAnnualInterestRate(1.5);
        //because the setAnnualInterestRate is static and the variable also static, mean that this variable always remains constant unless no other AnnualInterestRate variable and setAnnualInterestRate override it
        //the value with static will be same on the same object. Mean that if create two same type of the object, the static variable is same even though you just set the value in one of the object
        Account1 p1 = new Account1("George",1122,1000);
        p1.deposit(30);
        p1.deposit(40);
        p1.deposit(50);
        p1.withdraw(5);
        p1.withdraw(4);
        p1.withdraw(2);
        for (int i = 0; i < p1.transaction.size(); i++) {
            System.out.println(p1.transaction.get(i));
        }
        //can be seen the special of the static if making the transaction become static
        Account1 p2 = new Account1("Georrge",11122,10400);
        p1.deposit(300);
        p1.deposit(400);
        p1.deposit(500);
        p1.withdraw(50);
        p1.withdraw(40);
        p1.withdraw(20);
        for (int i = 0; i < p2.transaction.size(); i++) {
            System.out.println(p2.transaction.get(i));
        }
        System.out.println(p2.getAnnualInterestRate());
    }
}

class Account1 extends Account{
    String name;
    ArrayList<String> transaction = new ArrayList<String>();


    public Account1(String name, int id,double balance){
        super(id,balance);
        this.name = name;
        transaction.add("Name: "+name);
        transaction.add("Balance: "+balance);
        transaction.add("Interest rate: "+ getAnnualInterestRate());

    }



    public void withdraw(double amount){
        super.withdraw(amount);
        Transaction t1 = new Transaction('W',amount,getBalance(),"Withdraw");
       transaction.add(""+t1.getType());
       transaction.add(""+t1.getAmount());
       transaction.add(""+t1.getDescription());

    }

    public void deposit(double amount){
        super.deposit(amount);
        Transaction t1 = new Transaction('D',amount,getBalance(),"deposit");
        transaction.add(""+t1.getType());
        transaction.add(""+t1.getAmount());
        transaction.add(""+t1.getDescription());

    }


}

class Transaction extends Account{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type,double amount,double balance,String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
