package com.user.dsa.dataStructures;

import java.util.Scanner;
public class BubbleSort {
    
    /**
     * sort method to sort an array in ascending
     * @param arr is an integer array
     */
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }       
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
        int[] array = new int[size] ;
        
        for(int i=0;i<array.length;i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(array);
    }
}