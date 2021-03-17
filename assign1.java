package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st no.= ");
        int n1=s.nextInt();
      
        System.out.println("Enter 2nd no.= ");
        int n2=s.nextInt();
      
        System.out.println("Enter 3rd no.= ");
        int n3=s.nextInt();

        if(n1==n2 && n2==n3)
            System.out.println("Equal");
        else
            System.out.println("Not equal");

    }
}
