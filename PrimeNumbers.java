package com.user.dsa.dataStructures;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int end = sc.nextInt();
        if(start>=0 && end <=1000) {
            System.out.println("Prime numbers between "+start+" and "+end+" are : ");
            int count;
            //loop for finding and printing all prime numbers between given range
            for(int i = start ; i <= end ; i++)
            {
                //logic for checking number is prime or not
                count = 0;
                for(int j = 1 ; j <= i ; j++)   
                {
                    if(i % j == 0)
                        count = count+1;
                }
                if(count == 2)
                    System.out.print(i+" ");
                
            }
        }else {
            System.out.println("Range should be within 0-1000");
        }
        sc.close();
    }
}
