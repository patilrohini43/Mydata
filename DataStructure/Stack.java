package all.program.data;

public class Stack<T>{

	//create arry stack
  int[] stack=new int[10];
  
  int top=0;
 
//for Push elements 
public void push(int data) {
	  stack[top]=data;       
	  top++;
	  
  }
  
//for pop elements
  public int pop()
  {
	  int data=0;
	  top--;
	  data=stack[top];
	  stack[top]=0;
	  return data;
  }
	
  //for peek elements
	public int peek()
	{
		int data=0;
		  data=stack[top-1];
		  return data;
	}
	
	//check stack is empty or not
	public boolean isEmpty()
	{
		return (top==-1);
	}
}
