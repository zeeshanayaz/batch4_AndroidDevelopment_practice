package com.company;

import java.util.Scanner;

/**
 * Created by Zeeshan on 6/4/2016.
 */
public class decimaltobinary {

    Scanner input = new Scanner(System.in);

    int arr[] = new int[20];
    boolean flag = true;
    int num, x,count = 0, i=0;

    public int input(){
        System.out.print("Enter the Number :   ");
        num = input.nextInt();
        return num;
    }

    public void showInput(){
        System.out.println("You entered  "+num);
    }

    public void conversion(int number){
        do {
            arr[i] = number%2;
            x = number/2;
            number = x;
            //System.out.println(arr[i]+"   "+ num +"   "+ x +"  "+count);      //just to check the values
            count++;
            i++;
        }while (number!=0);
    }

    public void print(){
        System.out.print("Binary representation of given number is  : ");
        do {
            System.out.print(arr[count]);
            count--;
        }while (count>=0);
        System.out.println("\n");
    }

}

