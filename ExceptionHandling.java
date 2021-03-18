package com.company;

import java.util.Scanner;
class InvalidZipCode extends Exception
{
    InvalidZipCode(String s)
    {
        super(s);
    }
}

public class Main {
    static void validate(int code) throws InvalidZipCode
    {
        int flag=0;
        int t;
        while(code!=0)
        {
            t=code%10;
            code=code/10;
            if(t-1 == code%10)
                flag=1;
            else
            {
                flag = 0;
                break;
            }
        }
        if(flag == 1)
        {
            throw new InvalidZipCode("Invalid code, delivery not available");
        }
        else
            System.out.println("Delivery available in your area!");
    }
    static void check_zipcode(int code)
    {
        try
        {
            validate(code);
        }catch(InvalidZipCode e)
        {
            System.out.println("Exception occured: "+e);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter zip code of your area= ");
        int zip=s.nextInt();
        check_zipcode(zip);

    }
}
