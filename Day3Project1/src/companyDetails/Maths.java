package companyDetails;

public class Maths 
{
	public static int add(int a, int b)
	{
		return a+b;
	}
	
	public static int factorial(int n)
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
}
