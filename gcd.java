package com.company;

import java.util.Scanner;

public class Main {
    static int gcd(int x,int y)
    {
        if (x == 0)
            return y;
        return gcd(y%x, x);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 nos.= ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    System.out.println("GCD of "+a+" and "+b+" = "+gcd(a,b));
    }
}
