import java.util.Scanner;

interface Accounts {
    double deposit(double balance);
    double withdraw(double balance);
    double calculateInterest(double balance);
    void viewBalance(double balance);
}

class SavingsAccount implements Accounts {
    @Override
    public double deposit(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Your amount has been deposited.");
        return balance;
    }

    @Override
    public double withdraw(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return balance; // No change in balance
        }
        balance -= amount;
        System.out.println("You have successfully withdrawn your money.");
        return balance;
    }

    @Override
    public double calculateInterest(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rate of interest (as a decimal): ");
        double roi = sc.nextDouble();
        System.out.print("Enter time in years: ");
        int t = sc.nextInt();
        double interest = balance * roi * t;
        System.out.println("Interest is: " + interest);
        return interest;
    }

    @Override
    public void viewBalance(double balance) {
        System.out.println("Your balance is: " + balance);
    }
}

class CurrentAccount implements Accounts {
    @Override
    public double deposit(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Your amount has been deposited.");
        return balance;
    }

    @Override
    public double withdraw(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return balance; // No change in balance
        }
        balance -= amount;
        System.out.println("You have successfully withdrawn your money.");
        return balance;
    }

    @Override
    public double calculateInterest(double balance) {
        // Current accounts typically don't earn interest, but this can be customized
        return 0;
    }

    @Override
    public void viewBalance(double balance) {
        System.out.println("Your balance is: " + balance);
    }
}

public class Bank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 100000; // Initial balance
        Accounts currentAccount = new CurrentAccount();
        Accounts savingsAccount = new SavingsAccount();

        while (true) {
            System.out.println("\nChoose an account type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            Accounts selectedAccount;
            if (choice == 1) {
                selectedAccount = savingsAccount;
            } else if (choice == 2) {
                selectedAccount = currentAccount;
            } else {
                System.out.println("Invalid choice! Please try again.");
                continue; // Skip to the next iteration
            }

            while (true) {
                System.out.println("\nSelect an operation:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. View Balance");
                System.out.println("4. Calculate Interest");
                System.out.println("5. Back to Main Menu");
                System.out.print("Enter your choice: ");
                int operation = sc.nextInt();

                switch (operation) {
                    case 1:
                        balance = selectedAccount.deposit(balance);
                        break;
                    case 2:
                        balance = selectedAccount.withdraw(balance);
                        break;
                    case 3:
                        selectedAccount.viewBalance(balance);
                        break;
                    case 4:
                        if (selectedAccount instanceof SavingsAccount) {
                            selectedAccount.calculateInterest(balance);
                        } else {
                            System.out.println("Current accounts do not earn interest.");
                        }
                        break;
                    case 5:
                        break; // Break to go back to the main menu
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        continue;
                }

                if (operation == 5) {
                    break; // Exit the inner loop
                }
            }
        }
        sc.close();
    }
}
