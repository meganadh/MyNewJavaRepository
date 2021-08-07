package mypackage;

public class Stack 
{
	static final int MAX = 10;
	int top;
	int a[] = new int[MAX];
	
	Stack()
	{
		top=-1;
	}
	
	boolean isEmpty()
	{
		return (top<0);
	}
	
	boolean push(int data)
	{
		if(top>=(MAX-1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			top=top+1;
			a[top]=data;
			System.out.println("Data added to stack");
			return true;
		}
	}
	
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			int x=a[top--];
			return x;
		}
	}
	
	int peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			int x=a[top];
			return x;
		}
	}
	
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push(10);
		s.push(25);
		s.push(99);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
