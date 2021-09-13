package com.user.dsa.dataStructures;

import java.util.Scanner;
public class MergeSort {
    /**
     * merges two sub arrays
     * @param arr string array
     * @param l start index
     * @param m middle index
     * @param r end index
     */
    public static void merge(String[] arr, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        /* Create temp arrays */
        String L[] = new String [n1];
        String R[] = new String [n2];
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i].compareTo(R[j])<=0)
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
   /**
    * merge sort method
    * @param arr is a string array
    * @param l is a start index
    * @param r is a end index
    */
    public static void sort(String[] arr, int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    
    /* A utility function to print array of size n */
    static void printArray(String[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
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
        int l =0;
        int r = array.length-1;
        sort(array,l,r);
        printArray(array);
    }
}