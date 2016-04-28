package com.company;

public class Main {

    public static void main(String[] args) throws java.io.IOException{
	// write your code here
        char choice,again;
        boolean check = false;
        do
        {
            System.out.println("Help on:");
            System.out.println("\t1.\tif");
            System.out.println("\t2.\tswitch");
            System.out.print("choose any one : ");

            choice = (char) System.in.read();
            System.in.read();

            switch (choice){
                case '1':
                {
                    System.out.println("Syntax of if\n");
                    System.out.println("if(condition)\n{\n\tif code\n}\nelse\n{\n\telse code\n}");
                    break;
                }
                case '2':
                {
                    System.out.println("Syntax of switch\n");
                    System.out.println("switch (condition)\n{\n\tcase():\n\t\tcase code\n\t\tbreak\n\tcase():\n\t\tcase code\n\t\tbreak;\n\tdefault:\n\t\tdefault code\n\t\tbreak");
                    break;
                }
                default:
                {
                    System.out.println("Unmatched choice!");
                    break;
                }
            }
            System.out.print("Want to do it again? Enter y/n  :  ");
            again = (char) System.in.read();
            System.in.read();
            if(again=='y')
            {
                check = true;
            }
            else
            {
                check = false;
                System.out.println("\n\t\t+++++Thanks for being here+++++");
            }
        }
        while (check);


    }
}
