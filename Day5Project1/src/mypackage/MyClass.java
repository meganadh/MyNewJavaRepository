package mypackage;

public class MyClass {

	public static void main(String[] args) 
	{
		//Jagged Array
		
		char[][] names = new char[][]
				{
					new char[] {'r','a','m'},
					new char[] {'m','e','g','a','n','a','d','h'},
					new char[] {'o','m'}
				};
				
		for(int i=0;i<names.length;i++)
		{
			for(int j=0;j<names[i].length;j++)
			{
				System.out.print(names[i][j]+" ");
			}
			System.out.printf("\n");
		}
	}

}
