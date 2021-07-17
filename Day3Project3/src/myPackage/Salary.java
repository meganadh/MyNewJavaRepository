package myPackage;

public class Salary
{
	public int PF(int basic)
	{
		return 12*basic/100;
	}
	 
	public int HRA(int basic)
	{
		return 40*basic/100;
	}
	 
	public abstract int SA();

	public abstract int TA();
}

class MicrosoftSalary extends Salary
{

	@Override
	public int SA() {
		return 30000;
	}


}

class CognizantSalary
{
	public int PF(int basic)
	{
		return 12*basic/100;
	}
	 
	public int HRA(int basic)
	{
		return 40*basic/100;
	}
	 
	public int SA()
	{
		return 10000;
	}
	
	public int TA()
	{
		return 1500;
	}
}

class InfosysSalary
{
	public int PF(int basic)
	{
		return 12*basic/100;
	}
	 
	public int HRA(int basic)
	{
		return 40*basic/100;
	}
	 
	public int SA()
	{
		return 30000;
	}

}
