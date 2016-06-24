package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner input = new Scanner(System.in);
        boolean again = false;

        do {
            System.out.println("Please Select any one of them:.......");
            System.out.println("1  Add Teacher\n2  View Teacher\n3  Search Teacher\n4  Add Student\n5  View Student\n6  " +
                    "Search Student\n7  Exit");

            int menu = input.nextInt();

            switch (menu)
            {
                case 1:
                {
//                    Runtime.getRuntime().exec( "command /c cls" ) ;
//                    Runtime.getRuntime().exec("cls");
//                    Runtime.getRuntime().exec("clear");
                    System.out.println("Add teacher");
                    break;
                }
                case 2:
                {
                    System.out.println("View Teacher");
                    break;
                }
                case 3:
                {
                    System.out.println("Search Teacher");
                    break;
                }
                case 4:
                {
                    System.out.println("Add Student");
                    break;
                }
                case 5:
                {
                    System.out.println("View Student");
                    break;
                }
                case 6:
                {
                    System.out.println("Search Student");
                    break;
                }
                case 7:
                {
                    System.out.println("Exit");
                    again = true;
                    break;
                }
                default:
                    System.out.println("Enter a valid choice.......");

            }
        }while (again==false);

    }
}
