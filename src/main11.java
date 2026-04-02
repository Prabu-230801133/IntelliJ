import java.sql.SQLOutput;
import java.util.Scanner;

public class main11 {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){
        int choice;
        double balance=0;
        boolean status=true;
        while(status) {
            System.out.println("*************************");
            System.out.println("WELCOME TO BAKING PROGRAM");
            System.out.println("*************************");

            System.out.println("1. Show balance.");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawl");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdrawl();
                case 4 -> status = false;
                default -> System.out.println("Choose a valid option from the list.!");
            }
        }

        scanner.close();
    }
    static void showbalance(double bal){
        System.out.println("*************************");
        System.out.println("Your balance is : $ "+bal);

    }
    static double deposit(){
        double amount;
        System.out.print("Enter the amount to be deposited: ");
        amount=scanner.nextDouble();
        return amount;
    }
    static double withdrawl(){
        double amt;
        System.out.print("Enter the amount to be withdrawn : ");
        amt=scanner.nextDouble();
        return amt;
    }

}
