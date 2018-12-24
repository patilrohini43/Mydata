
/*
* Created by:Rohini Patil
* Date 24/12/2018
* Purpose:Write a program with Static Functions to do Merge Sort of list of
Strings.
**/

package all.algo.program;

import all.program.utility.Utility1;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility1 u=new Utility1();
	
		System.out.println("Enter The number of String Do you Want");
		int num=u.inputInteger();
		String[] arr=new String[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter array["+i+"] : ");
			arr[i]=u.inputString();
		}
		
		System.out.println("Given array:-");
		 num=arr.length;
	        for (int i=0; i<num;++i)
              System.out.print(arr[i] + " ");


		      u.sort(arr, 0, arr.length-1);
	  
	
		System.out.println("\nSorted array");
		num = arr.length;
	        for (int i=0; i<num;++i)
	               System.out.print(arr[i] + " ");
    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
