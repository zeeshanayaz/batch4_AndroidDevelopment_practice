package com.company;

public class Main {

    public static void main(String[] args) {
        String successor;

        for (int i = 1; i<=100; i++) {
            if ((i % 2 != 0) && (i % 3 != 0)) {
                successor = "     ";
                System.out.println(i + successor);
            }

            if ((i % 2 == 0) || (i % 3 == 0)) {
                if ((i % 2 == 0) && (i % 3 == 0)) {
                    successor = "     bar foo";
                    System.out.println(i + successor);
                } else if ((i % 2 == 0)) {
                    successor = "     bar";
                    System.out.println(i + successor);
                } else if ((i % 3 == 0)) {
                    successor = "     foo";
                    System.out.println(i + successor);
                }

            }
        }
    }
}
