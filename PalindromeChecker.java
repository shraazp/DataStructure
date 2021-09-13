package com.user.dsa.dataStructures;

import java.util.*;
import java.util.Scanner;

import com.user.dsa.dataStructuresbase.Dequeue;

public class PalindromeChecker {
    public static void main(String[] args) {
        Dequeue<Character> q = new Dequeue<Character>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Palindrome Checker");
        System.out.println("enter the word ");
        String word =  sc.next();
        char arr[] = word.toCharArray();
        for(char ha : arr) {
         q.addfront(ha);  
        }
       String str = "";
       for(int i=0;i<arr.length; i++) {
           str = str + q.removeFront(); 
       }
       if(word.equals(str)) {
           System.out.println(str+" is a palindrome");
       }else {
           System.out.println(str+ " is not a palidrome");
       }
        
    }
}
