package single_inheritance;
//import java.util.*;
//
//class BankAccount {
//    protected String accountNumber;
//    protected String accountHolder;
//    protected double balance;
//
//    public BankAccount(String number, String holder, double balance) {
//        this.accountNumber = number;
//        this.accountHolder = holder;
//        this.balance = balance;
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposit successful. New balance: " + balance);
//    }
//
//    public void withdraw(double amount) {
//        if (balance >= amount) {
//            balance -= amount;
//            System.out.println("Withdrawal successful. New balance: " + balance);
//        } else {
//            System.out.println("Insufficient balance. Cannot withdraw.");
//        }
//    }
//
//    public void displayBalance() {
//        System.out.println("Account Holder: " + accountHolder);
//        System.out.println("Account Number: " + accountNumber);
//        System.out.println("Balance: " + balance);
//    }
//}
//
//class SavingsAccount extends BankAccount {
//    private double interestRate;
//
//    public SavingsAccount(String number, String holder, double balance, double interestRate) {
//        super(number, holder, balance);
//        this.interestRate = interestRate;
//    }
//
//    public void addInterest() {
//        double interestAmount = balance * interestRate / 100;
//        balance += interestAmount;
//        System.out.println("Interest added. New balance: " + balance);
//    }
//}
//
//class CheckingAccount extends BankAccount {
//    private double overdraftLimit;
//
//    public CheckingAccount(String number, String holder, double balance, double overdraftLimit) {
//        super(number, holder, balance);
//        this.overdraftLimit = overdraftLimit;
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        if (balance + overdraftLimit >= amount) {
//            balance -= amount;
//            System.out.println("Withdrawal successful. New balance: " + balance);
//        } else {
//            System.out.println("Exceeds overdraft limit. Cannot withdraw.");
//        }
//    }
//}


public class Bank {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//        int choice;
//
//        do {
//        	System.out.println();
//            System.out.println("Choose an option:");
//            System.out.println("1. Savings Account");
//            System.out.println("2. Checking Account");
//            System.out.println("3. Exit");
//            choice = in.nextInt();
//
//            switch (choice) {
//                case 1:
//                    SavingsAccount savings = new SavingsAccount("SA001", "John Doe", 5000, 3.5);
//                    savings.deposit(1000);
//                    savings.withdraw(2000);
//                    savings.addInterest();
//                    savings.displayBalance();
//                    break;
//                case 2:
//                    CheckingAccount checking = new CheckingAccount("CA001", "Jane Smith", 3000, 2000);
//                    checking.deposit(500);
//                    checking.withdraw(4000);
//                    checking.displayBalance();
//                    break;
//                case 3:
//                    System.out.println("Exited");
//                    break;
//                default:
//                    System.out.println("Wrong input. Please choose again.");
//            }
//        } while (choice != 3);
	}

}
