package all.program.data;

public class Stack<T> {
	int[] stack=new int[20];
  int top=1;
	
	public void push(int data)
	{
		
		stack[top]=data;
		top++;
		
	}
	
	public int pop()
	{
	
		int data;
		top--;
		data=stack[top];
		stack[top]=0;
		return data;
		
	}
	
	public  int peek()
	{
		int data;
		
		data=stack[top];
	
		return data;
	}
	
	public void show()

	{
		for(int n:stack)
		{
			System.out.println(n+"");
		}
	}
	
	
	public boolean isEmpty()
	{
		if(stack[top]==-1)
		{
			return true;
		}
		else
		{
	
		return false;
		}
	}
}
