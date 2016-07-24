package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        Student student = new Student();
        Teacher teacher = new Teacher();
        int studentflag = 0, teacherFlag = 0;
        boolean again = true;

        do
        {
            //Menu
            System.out.println("Choose any one.......");
            System.out.println("1   Add Student\n2   View Student\n3   Search Student");
            System.out.println("4   Add Teacher\n5   View Teacher\n6   Search Teacher");
            System.out.println("7   Exit");
            int jump = input.nextInt();
            switch (jump)
            {
                case 1:
                {
                    System.out.println("\t\t**************Adding Student**************");
                    student.addStudent(studentflag);
                    studentflag++;
                    System.out.println("\n\tStudent added Successfully\n\n");
                    break;
                }
                case 2:
                {
                    System.out.println("\t\t**************View Student**************");
                    student.viewStudent(studentflag);
                    System.out.println("\n\tList Ended\n\n");
                    break;
                }
                case 3:
                {
                    System.out.println("\t\t**************Search Student**************");
                    System.out.print("Enter Student Name to SEARCH\t:\t");
                    String searchStudentName = (input.next()).toUpperCase();
                    student.searchStudent(searchStudentName,studentflag);
                    break;
                }
                case 4:
                {
                    System.out.println("\t\t**************Add Teacher**************");
                    teacher.addTeacher(teacherFlag);
                    teacherFlag++;
                    System.out.println("\n\tTeacher added Successfully\n\n");
                    break;
                }
                case 5:
                {
                    System.out.println("\t\t**************View Teacher**************");
                    teacher.viewTeacher(teacherFlag);
                    System.out.println("\n\tList Ended\n\n");
                    break;
                }
                case 6:
                {
                    System.out.println("\t\t**************Search Teacher**************");
                    System.out.print("Enter Teacher name to Search\t:\t");
                    String searchTeacherName = (input.next()).toUpperCase();
                    teacher.searchTeacher(searchTeacherName,teacherFlag);
                    break;
                }
                case 7:
                {
                    System.out.println("\t****************************\nThanks for being here!!!\n\tHave a nice day  :)");
                    again = false;
                    break;
                }
                default:
                {
                    System.out.println("\t\tSelect the right option!!!!!");
                }
            }

        }while(again==true);
    }
}
