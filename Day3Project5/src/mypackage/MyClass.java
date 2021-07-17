package mypackage;

public class MyClass {

}

class EnglishMessage
{
	public void printHi()
	{
		System.out.println("Hi");
	}
	public void printHello()
	{
		System.out.println("Hello");
	}
	public void printGoodMorning()
	{
		System.out.println("Good Morning");
	}
}

class HindiMessage extends EnglishMessage
{
	@Override
	public void printGoodMorning()
	{
		System.out.println("Subhoday");
	}
}