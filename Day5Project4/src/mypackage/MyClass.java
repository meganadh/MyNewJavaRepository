package mypackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass 
{
	public static void main(String[] args)
	{				
		Pattern p = Pattern.compile("meg[0-9]?");
		Matcher m = p.matcher("meg25");
		
		if(m.matches())
			System.out.println("VALID CODE");
		else
			System.out.println("INVALID CODE");
		
	}
}
