package com.company;

import java.util.Scanner;

public class Main {
    static void asterisks(int n)
    {
        for(int i=0;i<n;i++)
        {
            if(i%2 == 0)
                for(int j=0;j<(n+1)/2;j++)
                    System.out.print("* ");
            else
                for(int j=0;j<n/2;j++)
                    System.out.print(" *");

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n= ");
        int n=s.nextInt();
        Main.asterisks(n);
    }
}
