package all.program.com;

import java.util.Scanner;

public class Coupen {
	
	
	private static int getCoupen(int n) {
		// TODO Auto-generated method stub
		 return (int) (Math.random() * n);
		
	}
	
	private static int collect(int n) {
		// TODO Auto-generated method stub
		boolean[] isCollected=new boolean[n];
		int count=0;
		int distinct=0;
		while(distinct<n)
		{
			int value=getCoupen(n);
			 count++;                             // one more card
	            
				if (!isCollected[value]) {           // discovered a new card type
	                distinct++;
	                isCollected[value] = true;
	            }
	        }
	        return count++;
	}
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Number");
		int n=Integer.parseInt(args[0]);
		int count=collect(n);
		System.out.println();
	

	
		
	}

	

}
