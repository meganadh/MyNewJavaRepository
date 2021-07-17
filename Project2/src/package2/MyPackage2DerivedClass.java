package package2;

import package1.MyPackage1BaseClass;

public class MyPackage2DerivedClass extends MyPackage1BaseClass
{
	public void myPackage2DerivedClassMethod()
	{
		a=5;
		b=10;
		c=11;
		d=12;
	}
}

class MyPackage2OtherClass
{
	public void myPackage2OtherClassMethod()
	{
		MyPackage1BaseClass obj=new MyPackage1BaseClass();
		obj.a=10;
		obj.b=11;
		obj.c=12;
		obj.d=13;
	}
}
