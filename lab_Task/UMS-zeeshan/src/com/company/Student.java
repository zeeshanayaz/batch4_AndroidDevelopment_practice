package com.company;
import java.util.Scanner;

/**
 * Created by Zeeshan on 6/19/2016.
 */
public class Student {
    public String[] name = new String[5];
    public int[] rolNo = new int[5];
    public String[] course = new String[5];

    Scanner input = new Scanner(System.in);

    public void addStudent(int flag)
    {
        System.out.print("Enter Student Name\t:\t");
        name[flag] = (input.next()).toUpperCase();
        System.out.print("Enter Student Roll NO\t:\t");
        rolNo[flag] = input.nextInt();
        System.out.print("Enter Student Course\t:\t");
        course[flag] = input.next();
    }

    public void viewStudent(int flag)
    {
        System.out.println("Name\t\t\tRoll No\t\t\tCourse");
        for (int i = 0; i<flag; i++ )
        {
            System.out.println(name[i]+"\t\t\t\t"+rolNo[i]+"\t\t\t\t"+course[i]);
        }
    }

    public void searchStudent(String searchStudent,int flag)
    {
        System.out.println("Name\t\t\tRoll No\t\t\tCourse");
        for (int i = 0; i < flag; i++)
        {
            if (name[i].equals(searchStudent))
            {
                System.out.println(name[i] + "\t\t\t\t" + rolNo[i] + "\t\t\t\t" + course[i]);
                break;
            }
//            else if (i == (name.length - 1))
//            {
//                System.out.println(searchStudent + " Student not found! :(");
//            }

        }
    }

}
