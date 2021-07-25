package mypackage;

import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args)
	{
		int age;
		Scanner obj = new Scanner(System.in);
	
		char ch='i';
		
		do
		{		
			System.out.println("Enter your age:");
			age=obj.nextInt();
			
			if(age<=0 || age>100)
			{
				System.out.println("Please enter valid age");
			}
			else
			{
				System.out.println("Valid age");
				ch='v';
			}
			
		}while(ch!='v');
		obj.close();
	}
}
