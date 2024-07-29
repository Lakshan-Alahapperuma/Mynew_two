/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author lakshanalahapperuma
 */
import java.util.Scanner;

public class OnlineBankingApplication {

    private final String username = "Lakshan";
    private final String password = "nadun@2002";
    private double account_balance = 95000;

    public String getName() {

        return username;

    }

    public String getPassword() {

        return password;

    }

    public double getBalanc() {

        return account_balance;

    }

    public void setBalanc(long B) {
        this.account_balance = B;
    }

}

class BankManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankManagement NewObj = new BankManagement();

        int choice;

        authenticate();

        do {

            System.out.println("\nSelect a Number for the  operation:");
            
            System.out.println("1.Check Blanace\n");
            
            System.out.println("2.Deposite Money\n");
            
            System.out.println("3.Withraw Money\n");
            
            System.out.println("4.Exit\n");

            System.out.print("Enter Your Choice : ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    NewObj.getBalance();

                    break;

                case 2:

                    NewObj.deposite();

                    break;

                case 3:

                    NewObj.withdraw();

                    break;

            }

        } while (choice != 4);

    }

    static void authenticate() {

        OnlineBankingApplication obj = new OnlineBankingApplication();

        Scanner input = new Scanner(System.in);

        String U1, U2;

        System.out.print("Enter User Name :");
        U1 = input.nextLine().trim();

        System.out.print("Enter Password :");
        U2 = input.nextLine();

        if (obj.getName().equals(U1)) {

            System.out.println("User Name Correct\n");

        } else {

            System.out.println("User name is Incorrect\n");

        }

        if (obj.getPassword().equals(U2)) {

            System.out.println("Password is Correct\n");

        } else {

            System.out.println("Password is Incorrect\n");

        }

    }

    void getBalance() {

        OnlineBankingApplication obj = new OnlineBankingApplication();

        obj.setBalanc(95000);

        System.out.println("Your Bank Balanace is : " + obj.getBalanc());

    }

    double deposite() {

        Scanner input = new Scanner(System.in);

        OnlineBankingApplication obj = new OnlineBankingApplication();

        System.out.print("Enter Deposite Amount :");
        double in = input.nextDouble();

        double newamount = obj.getBalanc() + in;

        System.out.print("New Bank Balanace : " + newamount);

        return newamount;
    }

    void withdraw() {

        double Withdrawamount, depo;

        OnlineBankingApplication obj = new OnlineBankingApplication();

        Scanner input = new Scanner(System.in);

        double currentbalance = obj.getBalanc();

        System.out.print("Enter withdraw amount : ");

        Withdrawamount = input.nextDouble();

        if (Withdrawamount <= currentbalance) {

            double newbalance = currentbalance - Withdrawamount;

            System.out.println("Successfully Withdrawal\n");

            System.out.println("Your New Balance is : " + newbalance);

        } else {

            System.out.println("Insufficiant Balance\n");

        }

    }
}
