package mypackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) 
	{
		//Variable declaration
		int ans,result=0,a,b;
		Scanner obj = new Scanner(System.in);
		boolean isValid=true;
		
		//Read numbers from user
		System.out.println("Enter first number:");
		a=obj.nextInt();
		System.out.println("Enter second number:");
		b=obj.nextInt();
		
		System.out.println("Calculator Menu:");
		System.out.println("1. Addition");
		System.out.println("2. Multiplication");
		System.out.println("3. Subtraction");
		System.out.println("4. Division");
		System.out.println("Enter your choice:");
		ans = obj.nextInt();		
		
		switch(ans)
		{
			case 1:				
				break;
			case 2:
				result=a*b;
				break;
			case 3:
				result=a-b;
				break;
			case 4:
				result=a/b;
				break;		
		}
		
		if(isValid)
			System.out.println("RESULT = "+result);
		else
			System.out.println("Invalid option");

	}
}
