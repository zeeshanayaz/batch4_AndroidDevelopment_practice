package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean p,q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p=true; q=true;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));

        p=true; q=false;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));

        p=false; q=true;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));

        p=false; q=false;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
    }
}
