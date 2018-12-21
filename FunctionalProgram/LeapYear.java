/*
* Created by:Rohini Patil
* Date 13/12/2018
* Purpose: Leap Year
**/
package all.program.com;


import all.program.utility.Utility;

public class LeapYear {
	public static void main(String args[])
	{
	    Utility u=new Utility();
	    /**
	     * accept the value from user
	     */
		System.out.println("Enter Year u want");
		int year=u.inputInteger();
		
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
		/**
		 * if condition is satisfy the print leap year else not 
		 */
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
