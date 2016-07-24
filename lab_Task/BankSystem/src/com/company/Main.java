package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        boolean doAgain = true;
        int option;
        int flagAccountHolder=0;

        AccountHolder accountholder = new AccountHolder();
        BankAccount account = new BankAccount();
        Scanner input = new Scanner(System.in);

        System.out.println("Wellcome to National Banking System\n");
        do {
//            System.out.println("\n");
            System.out.println("1. Create new Account");
            System.out.println("2. Check the Account Holder Profile");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Check the Balance");
            System.out.println("6. Exit");

            System.out.print("Select any one option!\t\t");
            option = input.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("\n\t\t\tCreating New Account\n");
                    accountholder.CreateNewAccount(flagAccountHolder);
                    flagAccountHolder++;
                    break;
                }
                case 2: {
                    System.out.println("\n\t\t\tChecking the Account Holder Profile\n");
                    System.out.print("Enter Account No: \t");
                    int accNo = input.nextInt();
                    System.out.println("");
                    int flag = accountholder.checkAccountNo(accNo,flagAccountHolder);
                    if (flag == 100)
                        System.out.println("\t\t\tNot Found");
                    else
                    {
                        accountholder.DisplayAccountHolder(flag);
                    }
                    System.out.print("Press any key to continue.....");
                    System.in.read();
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("\n\t\t\tDepositing Amount\n");

                    System.out.print("Enter Account No: \t");
                    int accNo = input.nextInt();
                    System.out.println("");
                    int flag = account.checkAccountNo(accNo,flagAccountHolder);
                    if (flag == 100)
                        System.out.println("\t\t\tNot Found");
                    else
                    {
                        System.out.print("Enter the Amount you want to Deposit in Rs. : \t");
                        int depositAmount = input.nextInt();
                        account.Deposit(depositAmount,flag);
                    }
                    System.out.print("Press any key to continue.....");
                    System.in.read();
                    System.out.println("");

                    break;
                }
                case 4: {
                    System.out.println("\n\t\t\tWithdrawing Amount\n");

                    System.out.print("Enter Account No: \t");
                    int accNo = input.nextInt();
                    System.out.println("");
                    int flag = account.checkAccountNo(accNo,flagAccountHolder);
                    if (flag == 100)
                        System.out.println("\t\t\tNot Found");
                    else
                    {
                        System.out.print("Enter the Amount you want to Withdraw in Rs. : \t");
                        int withDrawAmount = input.nextInt();
                        account.Withdraw(withDrawAmount,flag);
                    }
                    System.out.print("Press any key to continue.....");
                    System.in.read();
                    System.out.println("");

                    break;
                }
                case 5:
                {
                    System.out.println("\n\t\t\tChecking the Balance\n");
                    System.out.print("Enter Account No: \t");
                    int accNo = input.nextInt();
                    System.out.println("");
                    int flag = account.checkAccountNo(accNo,flagAccountHolder);
                    if (flag == 100)
                        System.out.println("\t\t\tNot Found");
                    else
                    {
                        account.CheckBalance(accNo);
                    }
                    System.out.print("Press any key to continue.....");
                    System.in.read();
                    System.out.println("");

                    break;
                }
                case 6:
                {
                    System.out.println("\n\t\t\tHave a Nice Day........ \n");
                    doAgain = false;
                    break;
                }
                default:
                {
                    System.out.println("\n\t\t\tInvalid Selection.....\n");
                }
            }
        }
        while(doAgain==true);
    }
}
