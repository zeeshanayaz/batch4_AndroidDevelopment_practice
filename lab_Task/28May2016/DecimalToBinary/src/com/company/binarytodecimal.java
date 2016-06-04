package com.company;
import java.util.Scanner;

/**
 * Created by Zeeshan on 6/4/2016.
 */
public class binarytodecimal {
    Scanner input = new Scanner(System.in);
    int num,sum = 0,x, y , count = 0;

    public int input()
    {
        System.out.print("Enter the Binary Number :   ");
        num = input.nextInt();
        return num;
    }
    public void conversion(int number){
        do {
            y = 1;
            x = number % 10;
            if (x == 1){
                for (int j = 1; j<=count; j++)
                {
                    y*=2;
                }
                sum = sum+y;
            }
            number = (int) number/10;
            count++;
        }while (number != 0);
    }

    public void print(){
        System.out.print("Decimal representation of the given Number is :   "+sum+"\n\n");
    }


}
