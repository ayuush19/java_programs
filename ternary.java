package first_java;

import java.util.Scanner;

public class ternary {
	
	public static void main(String []args)
	{
		Scanner num= new Scanner (System.in);

		System.out.println("enter first number= ");
		int n1= num.nextInt();
		
		System.out.println("enter second number= ");
	    int n2= num.nextInt();
	    
	int lower=(n1<n2)?n1:n2;
	
	System.out.println("lower number is "+lower);
	num.close();
	
	}
}



