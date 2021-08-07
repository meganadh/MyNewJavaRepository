package mypackage;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyClass 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Queue<String> mq = new PriorityQueue<String>();
		
		mq.add("Meg");//2
		mq.add("Raj");//3
		mq.add("Kiran");//1
		mq.add("Shankar");//4
		
		System.out.println(mq.poll());
		
	}
}
