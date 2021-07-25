package mypackage;

public class Mathematics 
{
	public final static float PI = (float)22/7;
	
	static class Algebra
	{
		public static int add(int a, int b)
		{
			return a+b;
		}
	}
	static class Geometry
	{
		public static float circleArea(int r)
		{
			return PI*r*r;
		}
		public static float circlePerimeter(int r)
		{
			return 2*PI*r;
		}
	}
}
