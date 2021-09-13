package com.user.dsa.dataStructures;

import java.util.Scanner;

public class InsertionSort {
    /**
     * method to sort the string array
     * @param arr is array of strings
     */
    public static void inSort(String[] arr)
    {
        int n = arr.length;
        for (int i=1; i<n; i++)
        {
            String key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j].compareTo(key)>0)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter array elements");
        String[] array = new String[size] ;
        
        for(int i=0;i<array.length;i++) {
            array[i] = sc.next();
        }
        sc.close();
        inSort(array);
    }
}
