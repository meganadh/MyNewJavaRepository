package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product
{
	int id;
	String name;
	
	Product(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

public class MyClass 
{
	public static void main(String[] args) 
	{
		/*
		List<Integer> data = Arrays.asList(56,78,92,77,99);
		
		//for
		for(int i=0;i<data.size();i++)
			System.out.println(data.get(i));
		
		//hello
		for(int d:data)
			System.out.println(d);
		
		//ForEach method with lambda expression ->
		data.forEach(d->System.out.println(d));
		*/
		
		//Declaring list of products
		List<Product> products = new ArrayList<Product>();
		
		//adding products
		products.add(new Product(1,"TV"));
		products.add(new Product(2,"Mobile"));
		products.add(new Product(3,"Laptop"));
		
		//For loop
		for(int i=0;i<products.size();i++)
		{
			System.out.println(products.get(i).name);
		}
		
		//foreach loop
		for(Product p:products)
		{
			System.out.println(p.name);
		}
		
		//ForEach method and lambda
		products.forEach(p->System.out.println(p.name));

	}
}
