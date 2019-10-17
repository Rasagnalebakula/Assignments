package org.cap.app;

import java.util.Scanner;

public class SimpleCompound 
{

	public static void main(String[] args) 
	{
      
		double pr, rate, t, sim,com;
		
	    Scanner sc=new Scanner (System. in);
	    
	    System.out.println("Enter the amount:");
	    pr=sc.nextDouble();
	    
	    System. out. println("Enter the No.of years:");
	    t=sc.nextDouble();
	    
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    
	    //simple interest
	    sim=(pr * t * rate)/100;
	    
	    //compound interest
	    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    
	    System.out.println("Simple Interest="+sim);
	    System.out. println("Compound Interest="+com);
	}
}
