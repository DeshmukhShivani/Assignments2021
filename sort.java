package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void bubble_sort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void heap_sort(int[] a)
    {
        int n=a.length;
        for(int i= n/2-1;i>=0;i--)
        {
            heapify(a,n,i);
        }
        for(int i=n-1;i>0;i--)
        {
            int t=a[0];
            a[0]=a[i];
            a[i]=t;

            heapify(a,i,0);
        }
        System.out.println(Arrays.toString(a));
    }
    static void heapify(int[] a,int n,int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && a[l] > a[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && a[r] > a[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(a, n, largest);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of no. of nos. in array= ");

        int ch;
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the nos.:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        do
        {
            System.out.println( "\n1.Use Bubble sort" +
                                "\n2.Use Heap sort" +
                                "\n3.Exit");
            ch=s.nextInt();

            switch(ch)
            {
                case 1:Main.bubble_sort(arr);
                break;

                case 2:Main.heap_sort(arr);
                break;

                case 3:break;
                default:System.out.println("Enter correct choice!");
                break;
            }
        }while(ch!=3);
    }
}
