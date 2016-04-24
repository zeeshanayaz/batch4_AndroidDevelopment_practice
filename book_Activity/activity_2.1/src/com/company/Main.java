package com.company;

public class Main {

    public static void main(String[] args) {

    /*  Book page no 38
        Try This 2-1
        Compute the distance to a lightning
        strike whose sound takes 7.2 seconds
        to reach you.
    */
        float soundtime =  1100f;
        float timeinterval = 7.2f;
        double distance;

        distance = timeinterval * soundtime;
        System.out.println("The lightening is "+distance+" feet away");
    }
}
