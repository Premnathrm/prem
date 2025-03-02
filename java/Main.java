


import java.util.Scanner;

class BankAccount {
  
    private String accountNumber;
    private int  balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        setBalance(balance);  
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;  
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine(); 
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println(" Balance: " + account.getBalance());
        System.out.print("Enter deposit amount: ");
        int depositAmount = scanner.nextInt ();  
        account.deposit(depositAmount);
        System.out.println("Updated Balance: " + account.getBalance());
        scanner.close();
    }
}


