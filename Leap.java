package all.program.com;

import java.util.Scanner;

public class Leap {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year u want");
		int year=sc.nextInt();
		boolean flag=true;
		if(year % 400 ==0)
		{
			flag=true;
		}
		else if(year % 100 == 0)
		{
			flag=false;
		}
		else if(year % 4 == 0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		
		}
		if(flag)
		{
			System.out.println("year" +year +"this is leap year");
			
		}
		else
		{
			System.out.println("year" +year+"this is not leap year");
			
		}
			
	}
}
