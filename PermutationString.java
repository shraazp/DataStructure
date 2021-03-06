package com.user.dsa.dataStructures;
import java.util.*;
public class PermutationString {
    static ArrayList<String> permutations=new ArrayList<>();
    static ArrayList<String> permutations2 = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string!");
        String str = sc.next();
        int n = str.length();
        PermutationString permutation = new PermutationString();
        permutation.permuteRecursion(str, 0, n-1);
        System.out.println("using recursive approach:"+permutations);
        permutation.permuteIteration(str);
        System.out.println("using iterative approach:"+permutations2);
        permutation.checkEqual();
        
    }
 
    /**
    * permutation function
    * @param str string to calculate permutation for
    * @param l starting index
    * @param r end index
    */
    private static  void permuteRecursion(String str, int l, int r)
    {
        if (l == r)
            permutations.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permuteRecursion(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
 
    /**
    * Swap Characters at position
    * @param a string value
    * @param i position 1
    * @param j position 2
    * @return swapped string
    */
    private static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    // Iterative function to generate all permutations of a string in Java
    // using Collections
   private static void permuteIteration(String str)
    {
        // base case
        if (str == null || str.length() == 0) {
            return;
        }
        // initialize the list with the first character of the string
        permutations2.add(String.valueOf(str.charAt(0)));
 
        // do for every character of the specified string
        for (int i = 1; i < str.length(); i++)
        {
            // consider previously constructed partial permutation one by one
 
            // (iterate backward to avoid ConcurrentModificationException)
            for (int j = permutations2.size() - 1; j >= 0 ; j--)
            {
                // remove current partial permutation from the ArrayList
                String s = permutations2.remove(j);
 
                // Insert the next character of the specified string at all
                // possible positions of current partial permutation. Then
                // insert each of these newly constructed strings in the list
 
                for (int k = 0; k <= s.length(); k++)
                {
                    // Advice: use StringBuilder for concatenation
                    permutations2.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }
    }
   private static  void checkEqual()
    {
        int c=0;
        for(int i=0;i<permutations.size();i++)
        {
            if(permutations2.contains(permutations.get(i)))
                continue;
            else
                c=1;
         }
         if(c==0)
             System.out.println("Both return the same permutations");
         else
             System.out.println("Both return different permutations");
    }
 
}

