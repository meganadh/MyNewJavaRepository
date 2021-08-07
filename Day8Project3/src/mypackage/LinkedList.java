package mypackage;

public class LinkedList 
{
	Node head;
	
	static class Node 
	{ 
		int data;
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	}
	
	public static LinkedList insert(LinkedList list, int data)
	{
		//Create a new node with the data they are giving
		Node new_node=new Node(data);
		
		//There are no elements in the list
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			//travel through all elements till you get next as null
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;			
		}
		
		return list;
	}
	
	public static void printList(LinkedList list)
	{
		Node currNode=list.head;
		System.out.println("Linked list is below:");
		
		while(currNode!=null)
		{
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList mydata = new LinkedList();
		
		//ADD 4 VALUES FOR THE LIST
		mydata=insert(mydata,45);
		mydata=insert(mydata,75);
		mydata=insert(mydata,98);
		mydata=insert(mydata,88);
		
		
		//PRINT THE LIST VALUES
		printList(mydata);
		
		

	}
}
