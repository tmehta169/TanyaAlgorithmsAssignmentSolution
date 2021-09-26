package com.greatlearning.main;

import java.util.Scanner;

public class Stocks
{
	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("Enter the no of companies");
		int size=sc.nextInt();
		Double [] stocks= new Double[size];
		
		for (int i=0;i<size;i++) 
		{
			System.out.println("Enter current stock price of company" + (i+1) + ":");
			stocks[i]=sc.nextDouble();
			
			System.out.println("Whether company price rose today as compared to yesterday");
			
			boolean bn = sc.nextBoolean();
			if (bn==true)
			{
				System.out.println("True");
			}
			else if (bn==false)
			{
				System.out.println("False");
			}
			
		}
		
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. Enter 0 to exit");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			double temp;
			for(int x=0;x<size;x++)
			{
				for(int j=x+1;j<size;j++)
				{
					if(stocks[x]>stocks[j])
					{
						temp=stocks[x];
						stocks[x]=stocks[j];
						stocks[j]=temp;
								
					}
				}
			}
			System.out.println("Stocks prices in Ascending Order are:");
			
			for(int x=0;x<size;x++)
			{
				System.out.print(stocks[x]+ ",");
			}
			
			break;
			
		case 2:
			double temp1;
			for(int x=0;x<size;x++)
			{
				for(int j=x+1;j<size;j++)
				{
					if(stocks[x]<stocks[j])
					{
						temp1=stocks[x];
						stocks[x]=stocks[j];
						stocks[j]=temp1;
								
					}
				}
			}
			System.out.println("Stocks prices in Descending Order are:");
			
			for(int x=0;x<size;x++)
			{
				System.out.print(stocks[x]+ ",");
			}
			
			break;
			

		       
		    
		
		}
			
	}
	}

	

	


