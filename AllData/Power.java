/*
* Created by: BridgeLabz
* Date 13/12/2018
* Purpose:Power of 2
**/
package all.program.com;

import java.util.Scanner;

import all.program.utility.Utility;



public class Power {
	public static void main(String args[])
	{
		Utility u=new Utility();
		/**
		 * get the value from user
		 */
		System.out.println("Enter Number");
		int num=u.inputInteger();
		int i=0;
		int powerOfTwo=1;
		/**
		 * check the number is greater than num
		 */
		while
			(i<=num)
		{
			/**
			 * print the power of 2
			 */
			System.out.println(i + " " + powerOfTwo);  
			/**
			 * get the double to next
			 */
			powerOfTwo = 2 * powerOfTwo; 
              i = i + 1;
		}
		
		
		
	}

}
