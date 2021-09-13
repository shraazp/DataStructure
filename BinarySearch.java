package com.user.dsa.dataStructures;

import java.io.*;
import java.util.*;
public class BinarySearch {
    /**
     * binary search method to check if word is present or not
     * @param arr is a string array
     * @param x is a word needs to be searched
     * @return index position of word
     */
    public static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            // Check if x is present at mid
            if (res == 0)
                return m;
            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Shravya P\\eclipse-workspace\\dataStructures\\src\\main\\java\\com\\user\\dsa\\dataStructures\\binary.txt"));
        Scanner sc = new Scanner(System.in);
        String line = null;
        while ((line = br.readLine()) != null) {
          String[] array = line.split(",");
          Arrays.sort(array);
          System.out.println("Enter the word to be searched");
          String key = sc.next();
          sc.close();
          int result = binarySearch(array, key);
          if (result == -1)
              System.out.println("Element not present");
          else
              System.out.println("Element found at index " + result);
        }
        br.close();
      }
}
