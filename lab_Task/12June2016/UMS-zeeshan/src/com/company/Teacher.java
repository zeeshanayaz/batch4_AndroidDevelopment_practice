package com.company;
import java.util.Scanner;

/**
 * Created by Zeeshan on 6/19/2016.
 */
public class Teacher {
    public String[] name = new String[10];
    public String[] qualification = new String[10];
    public int[] age = new int[10];

    Scanner input = new Scanner(System.in);

    public void addTeacher(int flag) {
        System.out.print("Enter Teacher Name\t:\t");
        name[flag] = (input.next()).toUpperCase();
        System.out.print("Enter Teacher Qualification\t:\t");
        qualification[flag] = input.next();
        System.out.print("Enter Teacher Age\t:\t");
        age[flag] = input.nextInt();
    }

    public void viewTeacher(int flag) {
        System.out.println("Name\t\t\tQualification\t\t\tAge");
        for (int i = 0; i < flag; i++) {
            System.out.println(name[i] + "\t\t\t\t" + qualification[i] + "\t\t\t\t" + age[i]);
        }
    }

    public void searchTeacher(String searchTeacher, int flag) {
        System.out.println("Name\t\t\tQualification\t\t\tAge");
        for (int i = 0; i < flag; i++) {
            if (name[i].equals(searchTeacher)) {
                System.out.println(name[i] + "\t\t\t\t" + qualification[i] + "\t\t\t\t" + age[i]);
                break;
            }
//            else if (i == (name.length - 1))
//            {
//                System.out.println(searchTeacher + " Teacher not found! :(");
//            }
        }

    }
}