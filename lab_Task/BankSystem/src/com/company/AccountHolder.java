package com.company;

import java.util.Scanner;

/**
 * Created by Zeeshan on 7/24/2016.
 */
public class AccountHolder extends Person{
    Scanner input = new Scanner(System.in);
    BankAccount account = new BankAccount();

    static long[] accountNo = new long[50];
    String[] accountTitle = new String[50];

    public void CreateNewAccount(int flag)
    {
        System.out.print("Enter Account Holder name: \t");
        name[flag] = input.next();
        System.out.print("Enter Age: \t");
        age[flag] = input.nextInt();
        System.out.print("Enter Gender: \t");
        gender[flag] = input.next();
        System.out.print("Enter full Address: \t");
        address[flag] = input.next();
        System.out.print("Enter Account Title: \t");
        accountTitle[flag] = input.next();
        System.out.print("Enter Account No: <Provided by Bank Officer> \t");
        accountNo[flag] = input.nextLong();
        System.out.println("\t\tProfile Created!");
    }

    public int checkAccountNo(int accNo, int flag)
    {
        for (int i = 0; i<=flag; i++)
        {
            if (accountNo[i]==accNo)
                return i;
        }
        return 100;
    }

    public void DisplayAccountHolder(int flag)
    {
        System.out.println("Account Title : "+accountTitle[flag]);
        System.out.println("Account No : "+accountNo[flag]);
        System.out.println("Applicant Name : "+name[flag]);
        System.out.println("Age : "+age[flag]);
        System.out.println("Gender : "+gender[flag]);
        System.out.println("Address : "+address[flag]);
//        System.out.println("Balance : Rs."+account.accountBalance[]);
        System.out.println("");
    }
}
