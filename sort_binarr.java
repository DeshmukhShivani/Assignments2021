package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] b_nums= { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        int k=0;
        for(int i=0;i<b_nums.length;i++)
            if(b_nums[i]==0)
                b_nums[k++]=0;
        
        for(int i=k;i< b_nums.length;i++)
            b_nums[i]=1;
      
        System.out.println(Arrays.toString(b_nums));
    }
}
