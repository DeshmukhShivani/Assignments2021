package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void decto_bin(int n)
    {
        ArrayList<Integer> a=new ArrayList<>();
        if(n == 0)
            System.out.println(0);
        else
        {
            while(n != 0)
            {
                a.add(n%2);
                n=n/2;
            }
        }
        for(int i=a.size()-1;i>=0;i--)
        {
            System.out.print(a.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter decimal no.= ");
        int a=s.nextInt();
        System.out.println("Binary representation is: ");
        Main.decto_bin(a);
    }
}
