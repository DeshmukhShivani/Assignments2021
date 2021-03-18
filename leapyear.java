package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year= ");
        int yr=s.nextInt();
        if(yr % 400==0)
            System.out.println("It's a leap year");
        else if(yr % 100==0)
            System.out.println("It's not a leap year");
        else if(yr % 4==0)
            System.out.println("It's a leap year");
        else
            System.out.println("It's a leap year");
    }
}
