package all.program.utility;

import all.program.utility.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility1 {
	
	private static int j;
	BufferedReader br;
	Utility u=new Utility();
	private int key;
	
	  public Utility1()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
	
		
		}
	 
	//take input word
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return "";
}


  //take the input for number
	  public int inputInteger(){
			try{
				try{	
					return Integer.parseInt(br.readLine());
				}
				catch(NumberFormatException n){
					System.out.println(n.getMessage());	
				}
			}catch(IOException io){
				System.out.println(io.getMessage());
			}
	return 0;
		
	  }
	  
	  
	/*
		public int[] input1DArray(int arraySize) {
		
		 System.out.println("Enter The Number  of Elements to be Sort");
	        int num=u.inputInteger();
	        int arr[]=new int[num];
	        System.out.println("Enter Numbers");
	         for(int i=0;i<num;i++)
	        	 arr[i]=u.inputInteger();
			return arr;
		}
	  
  
		public String[] input2DArray(int arraySize) {
			
			 System.out.println("Enter The Number  of Elements to be Sort");
		        String str=u.inputString();
		        String arr[]=new String[arraySize];
		        System.out.println("Enter Numbers;");
		         for(int i=0;i<arraySize;i++)
		        	 arr[i]=u.inputString();
				return arr;
			}
		  
		*/
	  
	  
	//Take 1st Array Input
		public int[] firstArray(int arrSize){
			int arr[]=new int[arrSize];
			for(int i=0;i<arrSize;i++){
				System.out.println("Enter array["+i+"] : ");
				arr[i]=u.inputInteger();
			}
			return arr;
		}

		//Take 2n array String Array Input
		public String[] secondArray(int arrSize){
			String arr[]=new String[arrSize];
			for(int i=0;i<arrSize;i++){
				System.out.println("Enter array["+i+"] : ");
				arr[i]=u.inputString();
			}
			return arr;
		}

		//Print 1D array
		public void printIntArray(int array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}
		
		//print 1D array String
		public void prinStringArray(String array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}

		

		  //BubbleSort Elements for Numbers
		  public int[] BubbleSort(int arr[])
		  {
			  int temp;
			  int num=arr.length;
			  for(int i=0;i<num-1;i++)
			  {
				  
				  for(int j=0;j<num-i-1;j++)
			  {
					  if(arr[j]>arr[j+1])
					  {
						  temp=arr[j];
						  arr[j]=arr[j+1];
						  arr[j+1]=temp;
					  }
				  }
			  }	
			  return arr;
		  }

		  
		  
		  
	   //

		  //BubbleSort Elements for Numbers
		  public String[] BubbleSortString(String arr[])
		  {
			  String temp;
			  int num=arr.length;
			  for(int i=0;i<num-1;i++)
			  {
				  
				  for(int j=0;j<num-i-1;j++)
			  {
					  if(arr[j].compareTo(arr[j+1])<0)
					  {
						  temp=arr[j];
						  arr[j]=arr[j+1];
						  arr[j+1]=temp;
					  }
				  }
			  }	
			  return arr;
		  }
		  
		  
		  //Binary Search
			public int binarySearch(int[] inputArr, int key) {
		        int start = 0;
		        int end = inputArr.length - 1;
		        while (start <= end) {
		            int mid = (start + end) / 2;
		            if (key == inputArr[mid]) {
		                return mid;
		            }
		            if (key < inputArr[mid]) {
		               	end = mid - 1;
		            } else {
		               	start = mid + 1;
		            }
		        }
		        return -1;
		}


			
			//Binary Search for String
			public int binarySearchString(String[] names, String key) {
		        int first = 0;
		        int last = names.length;
		        while (first<= last) {
		            int mid = (first + last) / 2;
		            if (key.compareTo(names[mid])<0) {
		            	last = mid;
		            }
		            if (key.compareTo(names[mid])>0){
		            	first = mid + 1;
		            } else {
		            	return mid;
		            }
		        }
		        return -1;
		}
			
			
			//insertion sort for Integer Numbers:
			public int[] insertionSort(int arr[]) 
		    { 
		        int n = arr.length;
		        for (int i=1; i<n; ++i) 
		        { 
		            int key = arr[i]; 
		            int j = i-1; 
		  
		            
		            while (j>=0 && arr[j] > key) 
		            { 
		                arr[j+1] = arr[j]; 
		                j = j-1; 
		            } 
		            arr[j+1] = key;
		        }
				return arr;
				
			}
			
			
			//Insertion sort for String
	
			public String[] insertionSortString(String arr[]) 
		    { 
		        int n = arr.length; 
		        for (int i=1; i<n; ++i) 
		        { 
		            String key = arr[i]; 
		            int j = i-1; 
		  
		           
		            while (j>=0)
		            {
		            	  if(key.compareTo(arr[j])<0)
			            { 
			                arr[j+1] = arr[j]; 
			                j = j-1; 
			            } 
			            arr[j+1] = key; 
		            }
		             
		        }
				return arr; 
			}
			

			
}
