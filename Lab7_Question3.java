package com.semester;

import java.util.*;

abstract class Accounts {
    public String accountHoldersName, address;
    public double balance;
    public int accountNumber;

    Accounts() {
    }

    Accounts(String accountHoldersName, String address, double balance, int accountNumber) {
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public void setAccountHoldersName(String ACName) {
        this.accountHoldersName = ACName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accNum) {
        this.accountNumber = accNum;
    }

    abstract boolean deposit(double amount);

    abstract boolean withdraw(double amount);

    public void display() {
        System.out.println("Account Holder Name: " + accountHoldersName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

/*
 * Create a subclass of this class SavingsAccount and add the following details:
 * Data members: rateOfInterest Method: calculateAmount() display – to display
 * rate of interest with new balance and full account holder details
 */

class SavingsAccount extends Accounts {
    public double rateOfInterest;

    // Default Constructor with no parameters to super class
    SavingsAccount() {
        super();
    }

    SavingsAccount(String accountHoldersName, String address, double balance, int accountNumber,
            double rateOfInterest) {
        super(accountHoldersName, address, balance, accountNumber);
        this.rateOfInterest = rateOfInterest;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient Balance");
            return false;
        }
    }

    public double calculateAmount() {
        return balance + (balance * rateOfInterest / 100);
    }

    public void display() {
        super.display();
        System.out.println("Rate of Interest: " + rateOfInterest);
        System.out.println("New Balance: " + calculateAmount());
        System.out.println("Address: " + address);
    }
}

/*
 * Create another subclass of the Accounts class, i.e. CurrentAccount with the
 * following: Data Members: overdraftLimit
 * 
 * Method: display() – to show overdraft limit along with the full account
 * holder details
 */

class CurrentAccount extends Accounts {
    public double overdraftLimit;

    CurrentAccount() {
        super();
    }

    CurrentAccount(String accountHoldersName, String address, double balance, int accountNumber,
            double overdraftLimit) {
        super(accountHoldersName, address, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount && balance + overdraftLimit >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient Balance");
            return false;
        }
    }

    public void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Address: " + address);
    }
}

public class Lab7_Question3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of accounts: ");
        int n = sc.nextInt();
        Accounts[] accounts = new Accounts[n];

        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------------");
            System.out.print("Enter the account holder name: ");
            String accountHoldersName = sc.next();
            System.out.print("Enter the address: ");
            String address = sc.next();
            System.out.print("Enter the balance: ");
            double balance = sc.nextDouble();
            System.out.print("Enter the account number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Enter the type of account: ");
            String type = sc.next();
            
            if (type.equals("Savings")) {
                System.out.print("Enter the rate of interest: ");
                double rateOfInterest = sc.nextDouble();
                accounts[i] = new SavingsAccount(accountHoldersName, address, balance, accountNumber, rateOfInterest);
            } else if (type.equals("Current")) {
                System.out.print("Enter the overdraft limit: ");
                double overdraftLimit = sc.nextDouble();
                accounts[i] = new CurrentAccount(accountHoldersName, address, balance, accountNumber, overdraftLimit);
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------------");
            System.out.println("Account Details: \n");
            accounts[i].display();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------------");
            System.out.print("Enter the account number to deposit: ");
            int accNum = sc.nextInt();
            System.out.print("Enter the amount to deposit: ");
            double amount = sc.nextDouble();
            accounts[accNum - 1].deposit(amount);
            System.out.println("----------------------------------");
            System.out.println("Account Details: \n");
            accounts[accNum - 1].display();
    
            System.out.println("----------------------------------");
            System.out.print("Enter the account number to withdraw: ");
            accNum = sc.nextInt();
            System.out.print("Enter the amount to withdraw: ");
            amount = sc.nextDouble();
            accounts[accNum - 1].withdraw(amount);
            System.out.println("----------------------------------");
            System.out.println("Account Details: \n");
            accounts[accNum - 1].display();
        }

        sc.close();
    }
}