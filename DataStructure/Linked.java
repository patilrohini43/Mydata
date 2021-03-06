package all.program.data;

import all.program.data.UnLinked.Node;

public class Linked<T>
{                                                                                                 
	Node head; // head node 
	class Node<T>
	{
		T data;
		Node next;           // object of class Node for pointing next node 
		public Node(T data)  // constructor for initializing the object
		{
			this.data = data; 
			next =null;      // by  default we providing value as null
		}
		
	}
	Node  <T>tail()           // for last element of linkedlist
	{
		Node tail =head;
		while(tail.next != null)
		{
			tail = tail.next;
			
		}
		return tail;
	}
	
	
	//###########################################Insert Method###############################################//
	//create insert method and pass parameter data 
	public void insert(T data)
	{
		Node<T> node=new Node(data);   // create node object
		node.data=data;             //assign data to node
		node.next=null;	            //and assign null to node next 
		
		if(head==null)             // head is null becuase the there is no node in list so then node =head
		{
			head=node;    //by default head is null
			
		}
		else
		{
			Node n=head;      //if node is not equal to null then point to next node 
			while(n.next!=null)
			{
				n=n.next;
				
			}
			n.next=node;
		}
	}
	
	
	/*public void delete(T key)
	{
		Node temp=head;
		Node prev =null;
		//if first and last node want to deleted
		if(temp.data.equals(key))
		{
			temp.next=temp.next; 
			return;
			//current node is store in head 
			//show("Node delete from head");
			//return;
		}
		//if mid node want to deleted
		while(temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
			
			
		}
		//if(temp==null)
		//{
			//System.out.println("Not Exist");
		//   //return;
		//}
		
	  prev.next=temp.next;
	  //show("Deleted after node");
		// return;
	}
*/
public void delete(T data)
{
	Node temp = head;
	Node prev = temp;
	if(head.data.equals(data))
	{
		head = temp.next;
		return;
	}
	while(temp.next != null)
	{
		prev = temp;
		temp = temp.next;
		if(temp.data.equals(data))
		{
			prev.next = temp.next;
			return;
		}
	}
	if(temp.data.equals(data))
	{
		prev.next = null;
	}
}




//*********************************************************************************************************************

public int length()              // find length
{
	int length =1 ;
	Node new_node = head;
	if(head == null)
	{
		
		return 0;
	}
		while(new_node.next != null)
	{
		length++;
		new_node = new_node.next;
	}
		
	return length;
}
//*************************************************************************************************************************************************

public void addFirst(T data)                    // add element at first
{
	Node new_node = new Node(data);
	new_node.next = head;
	head = new_node;
}


//****************************************************************************************************************************************************************************

public boolean isEmpty() // check my string is empty or not
{

	return (head == null);
}

//****************************************************************************************************************************************************************************************

public void show()
{
	Node new_node = head;
	int size = length();
	System.out.print("[");
	for(int i =0 ; i < size; i++)
	{
		
		System.out.print(new_node.data+",");
		new_node = new_node.next;
		
	}
	System.out.print("]");
	
	return;
}



//******************************************************************************************************************************************************

public int index(T data)
{
	System.out.println(data);
	Node <T>temp = head;
	int count = 1;
	if(head.data == data)
	{
		return 1;
	}
	while(temp.data.equals(data) == false && temp.next != null)
	{
		count++;
		temp = temp.next; 
	}
	if(count == length())
	{
		System.out.println("Enter element not present in list");
		return 0;
	}
	return count;
}

//*********************************************************************************************************************************************************************************

public void pop()// remove last element  
{
	Node temp = head;
	Node prev = temp;
	if(head == null)
	{
		System.out.println("not any element present for pop");
		return ;
	}
	while(temp.next != null)
	{
		prev =temp;
		temp = temp.next;
	}
	prev.next = null;
}


//---------------------------------------------------------------------------------------------------------//
public String get(int position)
{
	Node new_node = head;
	int count = 1;
	String s;
		while(new_node.next != null)
		{
		new_node = 	new_node.next;
		count++;
		if(count == position)
		{
			s = new_node.data.toString();
			return s;
		}
		}
	return null;
}




}