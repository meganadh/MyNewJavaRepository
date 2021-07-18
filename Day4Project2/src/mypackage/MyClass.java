package mypackage;


import java.util.ArrayList;
import java.util.Scanner;

public class MyClass 
{	
	public static void main(String[] args) 
	{
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(50);
		data.add(1000);
		data.add(90);
		data.add(30);
		
		int sum=0;
		for(var d:data)
			sum+=d;
		
		System.out.println(sum);
		
		
		
		
		
		
	}
}
