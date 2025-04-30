import java.util.Scanner;

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

    public double getBalance() {
        return balance;
    }
}
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", account.getBalance());
    }

    public void deposit(double amount) {
        if (account.deposit(amount)) {
            System.out.printf("Successfully deposited $%.2f%n", amount);
        } else {
            System.out.println("Deposit failed. Please enter a valid amount.");
        }
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.printf("Successfully withdrew $%.2f%n", amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient balance or invalid amount");
        }
    }
}
public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000.0); 
        ATM atm = new ATM(userAccount);

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                System.out.println("Thank you for using the ATM, Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose between 1-4.");
            }
}
}
}