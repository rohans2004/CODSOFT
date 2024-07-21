import java.util.Scanner;

//creating the main class and taking the initial balance from the user
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Initial Balance for the Account: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);
        ATM atm = new ATM(account);
        atm.run();
    }
}
//logic for the different users

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance() {
        return balance;
    }
}

//setting up the users interface 
class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\nATM Menu:\n");
        System.out.println("1.Withdraw"+"   2.Deposit"+"   3.Check Balance"+"   4.Exit");
       /* System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");*/
    }
//output after the process
    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + account.checkBalance());
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (account.deposit(amount)) {
            System.out.println("Deposit of " + amount + " successful. New balance: " + account.checkBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void checkBalance() {
        double balance = account.checkBalance();
        System.out.println("Current balance: " + balance);
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("\nEnter the Process you Want to Perform: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. \n HAVE A NICE DAY!!!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


