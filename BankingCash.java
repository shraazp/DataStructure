package com.user.dsa.dataStructures;
import java.util.Scanner;
import com.user.dsa.dataStructuresbase.Queue;
public class BankingCash {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cash=100000;
        System.out.println("Enter the number of persons");
        int person = sc.nextInt();       
        Queue<Integer> queue=new Queue<Integer>();
        for (int i =1; i <=person; i++) {
                queue.enqueue(i);
            }

       while(person!=0)
            {
                int count=0,option=0;
                while(count==0)
                {
                    System.out.println("Person "+person);
                    System.out.println("Cash present "+cash);
                    System.out.println("\nEnter option \n1.Withdrawal\n2.Deposit\n3.exit");
                    option=sc.nextInt();
                    if(option==1)
                    {
                        count+=1;
                    }
                    else if(option==2) {
                        count+=2;
                    }
                    else {
                       System.out.println("Invalid option");
                    }
                

                if(count==1)
                {
                    int amount1=0;
                    int countWithdrawal=0;
                    while(countWithdrawal==0)
                    {
                        System.out.println("Enter the amount to be Withdrawn:");
                        amount1=sc.nextInt();

                        if(amount1>cash)
                            System.err.println("Sorry, there is no sufficient cash\n");  
                        else
                            cash=cash-amount1;
                        countWithdrawal++;
                    }
                    queue.dequeue();
                }
                else if(option==2)
                {
                    int amount2=0;
                    int countdeposit=0;
                    while(countdeposit==0)
                    {
                        System.out.println("Enter the Deposited amount:");
                        amount2=sc.nextInt();
                        countdeposit++;
                        if(amount2<0)
                            System.err.println("Your entered amount is not valid\n");
                        else
                            cash=cash+amount2;
                    }
                    queue.dequeue();
                }
                person--;
            }
       System.out.println("remaining :" + cash);
            
            }
        }

    }

