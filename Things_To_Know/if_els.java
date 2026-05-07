import java.util.*;

public class if_els {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Project Name: ATM Banking System (If–Else Based)
        // 1. User Authentication (PIN Verification)

        System.out.print("Enter your 4-digit PIN: ");
        int pin = sc.nextInt();

        if (pin != 1234) {
            System.out.println("Incorrect PIN. Access Denied.");
            sc.close();
            return;
        }

        System.out.println("PIN verified Successfully!");
        System.out.println("Welcome to the ATM Banking System!");

        boolean running = true;
        double balance = 1000.0; // Initial balance

        // Menu-Driven Options
        while (running) {

            System.out.println("\nSelect an option:");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Withdrawal");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your current balance is: $" + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double withdrawalAmount = sc.nextDouble();

                if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
                    balance -= withdrawalAmount;
                    System.out.println("Withdrawal successful.");
                    System.out.println("Current Balance is: $" + balance);
                } else {
                    System.out.println("Insufficient funds or invalid amount.");
                }
            }
            else if (choice == 3) {
                System.out.print("Enter Deposit Amount: ");
                double depositAmount = sc.nextDouble();

                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Deposit Successful!");
                    System.out.println("Current Balance is: $" + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            }
            else if (choice == 4) {
                System.out.println("Thank you for using the ATM Banking System. Goodbye!");
                running = false;
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
