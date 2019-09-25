package com.company;

public class BankAccount {



    private int acc_num;
    private double balance;
    private String customer_name;
    private String email;
    private int phone_num;

    public BankAccount (){

        //creating constructor with default attributes
        //this has to be first line, wont work if eg print statement was first
        this(1234,10.00,"default name","default email",222222);

        System.out.println("Empty constructor test");
    }

    //can overload constructors

    public BankAccount(int acc_num, double balance , String customer_name, String email, int phone_num){

        this.acc_num = acc_num;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_num = phone_num;
        //instead of using setter you can do this but can lead to bugs later with inheritance
       // setCustomer_name(customer_name);

    }

    public BankAccount(String customer_name, String email, int phone_num) {

        //constructor with some default parameters
        this(12445,344.33,customer_name,email,phone_num);

    }

    public int getAcc_num(){

        return this.acc_num;
    }

    public void setAcc_num(int acc_num){

        this.acc_num = acc_num;
    }


    public double getBalance(){

        System.out.println("balance = " + balance);

        return this.balance;
    }

    public void setBalance(double balance){

        this.balance = balance;
    }

    public String getCustomer_name(){

        return this.customer_name;
    }

    public void setCustomer_name(String customer_name){

        this.customer_name = customer_name;
    }

    public String getEmail(){

        return this.email;
    }

    public void setEmail(String email){

        this.email = email;
    }

    public int getPhone_num(){



        return this.phone_num;
    }

    public void setPhone_num(int phone_num){

        this.phone_num = phone_num;
    }

    public double depositFunds(double deposit){



        return balance += deposit;


    }

    //better way below

    public void deposit(double depositAmount){

        this.balance += depositAmount;
        System.out.println("deposit : " + depositAmount);
    }

    public double withdrawFunds(double withdraw){


        if(balance - withdraw < 0){

            System.out.println("insufficent funds");
            return 0;
        }else {

            return balance -= withdraw;
        }
    }


}
