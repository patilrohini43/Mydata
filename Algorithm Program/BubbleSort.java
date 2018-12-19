package all.algo.program;

import all.program.utility.*;

public class BubbleSort {
	public static void main(String args[])
	{
		int i,j;
		
		 BubbleSort ob = new BubbleSort();
		 Utility u= new Utility();
        System.out.println("Enter The Number  of Elements to be Sort");
        int num=u.inputInteger();
        int arr[]=new int[num];
        System.out.println("Enter Numbers");
         for(i=0;i<num;i++)
        	 arr[i]=u.inputInteger();
         System.out.println("Sorted Elements");
         u.BubbleSort(arr);
         u.printList(arr);
        
	}

}
