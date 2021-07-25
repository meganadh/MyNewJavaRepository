package mypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		
		try
		{
			int a,b,c;
			
			System.out.println("Enter first number:");
			a=obj.nextInt();
			
			System.out.println("Enter second number:");
			b=obj.nextInt();
			
			c=a/b;
			
			System.out.println("Ans="+c);
			
			obj.next();
			
			obj.close();
			obj.next();
			obj.next();
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Please double check if you are entering number or not.");
			obj.next();
			obj.next();
			obj.next();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Cannot divide with zero");
			obj.next();
			obj.next();
			obj.next();
		}
		
		
	}
}
