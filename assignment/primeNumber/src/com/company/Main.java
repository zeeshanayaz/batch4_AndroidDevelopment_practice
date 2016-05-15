package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);


        boolean again = false;

        do
        {
            int n, status = 1, num = 3;

            System.out.print("Enter the number of prime numbers you want    ");
            n = s.nextInt();

            if (n >= 1)
            {
                System.out.println("First "+n+" prime numbers are :-");
                System.out.println(2);
            }
            else
            {
                System.out.println("Try again!");
                again = true;
            }
            for ( int count = 2 ; count <=n ;  )
            {
                for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
                {
                    if ( num%j == 0 )
                    {
                        status = 0;
                        break;
                    }
                }
                if ( status != 0 )
                {
                    System.out.println(num);
                    count++;
                }
                status = 1;
                num++;
            }
            again=false;
        }
        while (again = true);

    }
}
