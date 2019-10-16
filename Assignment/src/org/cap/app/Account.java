package org.cap.app;

import java.util.Scanner;

public class Account 
{
		static double  amount;
		static double balance;
    static void deposit(double value)
    {
    	amount+=value;
    	System.out.println("The deposited amount is:"+value);
	
    }
	
	static void withdraw(double value)
	{
		if(amount>value) 
		{
			amount-=value;
			System.out.println("Money can be withdrawn"+value);
		}
		else
		{
			System.out.println("Bank balance is insufficient");
		}
	}
	
	static void Print()
	{
		System.out.println("The total bank balance is");
		
	}
	public static void main(String[] args) 
	{

      Scanner scanner=new Scanner(System.in);	
      
      System.out.println("Enter the total bank balance :");
      double amount=scanner.nextDouble();
      
      System.out.println("Enter how much u have draw:");
      double balance=scanner.nextDouble();
      
        withdraw(balance);
		deposit(amount);
		
		Print();
	}

}
