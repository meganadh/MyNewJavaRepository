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
			
			
			
			
			//obj.close();

		}
		
		catch(InputMismatchException ex)
		{
			System.out.println("Please double check if you are entering number or not.");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Cannot divide with zero");
		}
		catch(Exception Ex)
		{
			System.out.println("Some error occured");
			System.out.println("Please write to : admin@mycompany.com");
		}
		finally
		{
			System.out.println("\n\n\n\n\n\n\nApplication designed by : meganadh@gmail.com");
			obj.next();
			obj.close();
			System.out.println("Hello");
		}
		
	}
}
