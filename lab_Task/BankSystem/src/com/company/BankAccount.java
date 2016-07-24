package com.company;

import java.util.Scanner;

/**
 * Created by Zeeshan on 7/24/2016.
 */
public class BankAccount {
    Scanner input = new Scanner(System.in);

    int[] accountBalance = new int[50];

    public int checkAccountNo(int accNo, int flag)
    {
        for (int i = 0; i<=flag; i++)
        {
            if (AccountHolder.accountNo[i]==accNo)
                return accNo;
        }
        return 100;
    }

    public void CheckBalance(int accNo)
    {
        System.out.println("\t\tAccount No : "+accNo);
        System.out.println("\t\tTotal Balance Rs. "+accountBalance[accNo]);
    }

    public void Deposit(int depositAmount ,int accNo) {
        accountBalance[accNo] = accountBalance[accNo]+depositAmount;
        System.out.println("\t\t\tDeposited Successfully.....\n\t\t\tyour new Balance is..:");
//        System.out.println("\t\tAccount No : "+accNo);
//        System.out.println("\t\tTotal Balance Rs. "+accountBalance[accNo]);
        CheckBalance(accNo);

    }

    public void Withdraw(int withDrawAmount , int accNo) {
        if (accountBalance[accNo]>withDrawAmount)
        {
            accountBalance[accNo] = accountBalance[accNo]-withDrawAmount;
            System.out.println("\t\t\tDeposited Successfully.....\n\t\t\tyour new Balance is..:");
//            System.out.println("\t\tAccount No : "+accNo);
//            System.out.println("\t\tTotal Balance Rs. "+accountBalance[accNo]);
            CheckBalance(accNo);
        }
        else
            System.out.println("\t\t\tLow Balance Error.\n\t\t\tYou cannot Withdraw this amount");


    }


}
