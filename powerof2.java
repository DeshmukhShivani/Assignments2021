package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n= ");
        int n=s.nextInt();
        if(n<=0)
            System.out.println("There are no positive powers of 2.");
        else
            for(int i=0;Math.pow(2,i)<=n;i++)
                System.out.println((int) Math.pow(2,i));
    }
}
