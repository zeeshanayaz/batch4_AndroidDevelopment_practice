package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
	// character Counter from string using Split method

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String you want to play with  :  ");
        String str = (s.nextLine()).toLowerCase();

        System.out.print("Enter the character you want to count in the String  :  ");
        char count = (char) System.in.read();


        String[] test = str.split(String.valueOf(count));

        int length = test.length;
        System.out.println("No of input character is in the given string is  :  " +(--length));
    }
}
