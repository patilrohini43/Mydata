package all.algo.program;

import all.program.utility.Utility;

public class QuestionNumber {
	public static void main(String args[])
	{
		Utility u=new Utility();
		int low = 0,mid=0;
		System.out.println("Enter the number u want");
	    int num=u.inputInteger();
		int high= (int) Math.pow(2, num);
	   System.out.println("Think number number between "+ low + "to" + high + "in range");
       
        int number=u.binarySearch(low,high);
        
        System.out.println("Your Number is"+number);
       
	}

}
