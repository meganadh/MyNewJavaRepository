package mypackage;

interface ISalary
{
	static void PrintCompany()
	{
		System.out.println("Microsoft");
	}
	default String DeveloperName()
	{
		return "Meganadh";
	}
	int getHRA(int basic);
	int getBonus();
}

class Microsoft implements ISalary
{
	@Override
	public int getHRA(int basic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class MyClass 
{
	public static void main(String[] args) 
	{
		String n="23_5_893";
		System.out.println(n.replace("_", ""));

	}
}
