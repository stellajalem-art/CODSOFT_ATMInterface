import java.util.Scanner;

class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        }

        else {
            System.out.println("Invalid Amount!");
        }
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
        }

        else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount userAccount = new BankAccount(10000);

        int choice;

        do {

            System.out.println("\n======= ATM MENU =======");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    userAccount.withdraw(withdrawAmount);
                    break;

                case 2:

                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    userAccount.deposit(depositAmount);
                    break;

                case 3:

                    userAccount.checkBalance();
                    break;

                case 4:

                    System.out.println("Thank you for using ATM!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
