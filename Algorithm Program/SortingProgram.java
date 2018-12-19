package all.algo.program;

import java.util.Arrays;

import all.program.utility.Utility1;

public class SortingProgram {
	
	public static long start=0;
	public static long end=0;
	public static long elapsed=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Utility1 u=new Utility1();
		
	
			System.out.println("--------Options for Searching and Sorting----------");
			System.out.println("1. BinarySearch  for Integer");
			System.out.println("2. BinarySearch  for String");
			System.out.println("3. InsertionSort  for Integer");
			System.out.println("4. InsertionSort  for String");
			System.out.println("5. BubbleSort for Integer");
			System.out.println("6. BubbleSort for String");
			System.out.println("7. Exit");
			System.out.println();
			System.out.println("Enter Your Choice:");
			int choice=u.inputInteger();
			System.out.println();
	 
             switch (choice) {
             case 1:

					start=System.currentTimeMillis();
					System.out.println("BinarySearch Integer Numbers");
					System.out.println("Enter size of Elements");
					int arrSize=u.inputInteger();
					int e[]=u.firstArray(arrSize);
					Arrays.sort(e);
					u.firstArray(arrSize);
					
				
					System.out.println("Enter Key: ");
					int k= u.binarySearch(e,u.inputInteger());
					//System.out.println("Sorted Array is: ");

					if(k==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+k+" position");
}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
                 break;
            	 
             
                
             case 2:
            	 start=System.currentTimeMillis();
					System.out.println("BinarySearch Integer Numbers");
					System.out.println("Enter size of Elements");
					int arrSize1=u.inputInteger();
			String e2[]=u.secondArray(arrSize1);
					Arrays.sort(e2);
					u.firstArray(arrSize1);
					
				
					System.out.println("Enter Key: ");
					int k1=u.binarySearchString(e2,u.inputString());
				
					//System.out.println("Sorted Array is: ");

					if(k1==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+k1+"position");
}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
              break;
         	 
                 
              
             case 3:
            	 start=System.currentTimeMillis();
					System.out.println("InsertationSort  For Integer Numbers");
					System.out.println("Enter size of Elements");
					int arrSize11=u.inputInteger();
					int e1[]=u.firstArray(arrSize11);
					u.printIntArray(e1);
				
					System.out.println("Enter Key: ");
					int k3[]=u.insertionSort(e1);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k3.length;i++)
					{
						System.out.println(k3[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
                 break;

             case 4:	
                 start=System.currentTimeMillis();
					System.out.println("InsertationSort  For Integer Numbers");
					System.out.println("Enter size of Elements");
					int arrSize2=u.inputInteger();
					String e3[]=u.secondArray(arrSize2);
					u.prinStringArray(e3);
				
					System.out.println("Enter Key: ");
					String[] k4=u.insertionSortString(e3);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k4.length;i++)
					{
						System.out.println(k4[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
              break;
                 
             case 5:
            	 

					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For Integer Numbers");
					System.out.println("Enter size of Elements");
					int arrSize5=u.inputInteger();
					int e5[]=u.firstArray(arrSize5);
					u.printIntArray(e5);
				
					System.out.println("Enter Key: ");
					int k11[]=u.BubbleSort(e5);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k11.length;i++)
					{
						System.out.println(k11[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
                    break;
                    
             case 6:
            	 

					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For String");
					System.out.println("Enter size of Elements");
					int arraySize1=u.inputInteger();
					String s[]=u.secondArray(arraySize1);
                    u.prinStringArray(s);
				
					System.out.println("Enter Key: ");
					String[] k111=u.BubbleSortString(s);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k111.length;i++)
					{
						System.out.println(k111[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
                 break;
            	 
             

             case 7: 
					System.exit(0);
			default:
					System.out.println("Wrong Input");
break;
             
             }
		
		
	}

}
