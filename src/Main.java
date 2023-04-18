import login.Auth;

import java.util.Scanner;

class BankingOperation {
    Scanner scanner = new Scanner(System.in);
    public static String DEPOSIT = "d";
    public static String WITHDRAW = "w";
    public void operationDecision(String val) {
        if(val.equals(DEPOSIT)) deposit();
        if(val.equals(WITHDRAW)) withdraw();
    }

    public void deposit() {
        System.out.println("Enter the amount you want to deposite: ");
        int amount = scanner.nextInt();
        System.out.println(amount + " deposited successful!");
        System.out.println("Welcome back any time");
        System.out.println("Logging out.............");
    }

    public void withdraw() {
        System.out.print("Enter the amount you want to withdraw: ");
        int amount = scanner.nextInt();
        if(amount > 1000) {
            System.out.println("Your balance is less than that. Retry...");
            withdraw();
        } else {
            System.out.println(amount + " withdrawn successful!");
            System.out.println("Welcome back any time");
            System.out.println("Logging out.............");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        if(new Auth(user, password).login()) {
            System.out.println("Logged in successful!");
            System.out.println("Welcome to your bank account");
            System.out.println("For deposite write d, for withdraw write w");
            System.out.print("Enter the value: ");
            String val = scanner.nextLine();
            new BankingOperation().operationDecision(val);
        } else {
            System.out.println("Wrong/Invalid credential!");
            main(new String[]{""});
        }


    }
}
