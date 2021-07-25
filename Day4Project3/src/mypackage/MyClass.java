package mypackage;

import java.util.Scanner;

class Employee
{
	private String name;
	private int salary;
	private int age;
	
	Employee()
	{
		this.name=null;
		this.salary=0;
		this.age=0;
	}
	
	Employee(String name, int salary, int age)
	{
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	
	public void readData()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter name:");
		name=obj.next();
		System.out.println("Enter Salary:");
		salary=obj.nextInt();
		System.out.println("Enter age:");
		age=obj.nextInt();
		obj.close();
	}
		
	public void printData()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+salary);
	}
	
}

public class MyClass 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		
		emp.printData();
	}
}









