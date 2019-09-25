package com.company;

public class Main {

    public static void main(String[] args) {

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        BankAccount ba = new BankAccount();

        //calling constructor
        BankAccount bankAcc = new BankAccount(123,200.00,"Billy","bill@gmail",4543334);

        ba.setBalance(100.00);

        ba.depositFunds(50.00);

        ba.getBalance();
        System.out.println(ba.getBalance());

        ba.withdrawFunds(66.89);

        System.out.println(ba.getBalance());

        ba.withdrawFunds(134.59);

        bankAcc.getBalance();

        BankAccount baEmpty = new BankAccount();

        System.out.println(baEmpty.getCustomer_name());


        //calling constructor that has some parameter

        BankAccount DaraAcc = new BankAccount("Dara","dg@email",999);



        System.out.println(DaraAcc.getAcc_num() + " ac/num + name " + DaraAcc.getCustomer_name());



    }
}
