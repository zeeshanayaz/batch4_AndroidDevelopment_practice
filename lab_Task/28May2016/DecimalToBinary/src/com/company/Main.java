package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.io.IOException{
	// Decimal to Binary conversion and Binary to Decimal conversion
        boolean againBool = false;
        tryagain tr = new tryagain();
        do {
            char conv;
            int number;
            System.out.print("Press <B> to convert binary to decimal system and <D> for decimal to binary  :   ");
            conv = (char) System.in.read();
            System.in.read();
            if (conv == 'D' || conv == 'd')
            {
                decimaltobinary dTb = new decimaltobinary();
                number = dTb.input();
                //dTb.showInput();
                dTb.conversion(number);
                dTb.print();
                againBool = tr.wantme();
            }
            else if(conv == 'B' || conv == 'b')
            {
                binarytodecimal bTd = new binarytodecimal();
                number = bTd.input();
                bTd.conversion(number);
                bTd.print();
                againBool = tr.wantme();
            }
            else
            {
                System.out.println("Invalid Input\n\n");
                againBool = tr.wantme();
            }
        }while(againBool == false);

    }
}
