
/*
* Created by: BridgeLabz
* Date 13/12/2018
* Purpose: Flip Coin and print percentage of Heads and Tails
**/


package all.program.com;

public class FlipCoin {
	public static void main(String args[])
	{
		int loopCount=1;
		double result;
		int heads=0;
		
		while(loopCount<=10)
		{
			/**
			 * math.random() produces results >= 0.0 and < 1.0
			 */
			result=Math.random();
			if(result <= .5)
				System.out.println("this is heads");
			if(result <= .5)
				heads=heads++;
			else
				System.out.println("this is tails");
				loopCount=loopCount+1;
				
		}
		/**
		 * calculate percentage
		 */
		double perHeads=heads/10*100;
		double perTails=(10-heads)/10*100;
	System.out.println("Percentage of Heads"+ perHeads);
	System.out.println("Percentage of Heads"+ perTails);
	}

}
