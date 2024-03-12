package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        
        if(response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(name, number, initialDeposit);
        } else {
            account = new Account(number, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.print(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.print(account);

        sc.close();
    }
}