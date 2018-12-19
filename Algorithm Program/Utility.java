package all.program.utility;

import all.algo.program.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

	
	BufferedReader br;
	
	
	  public Utility()
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

			
		  //check the string is anagram or not
		  
		  public static void isAnagram(String input1, String input2){
		        //Remove all whitespace first
		        String  s1= input1.replaceAll("\\s", "");
		 
		        String s2 = input2.replaceAll("\\s", "");
		        
		        boolean status = true;
		 
		        if(s1.length() != s2.length())
		        {
		            status = false;
		        }else {
		            //Convert into character array
		 
		            char[] s1Array = s1.toLowerCase().toCharArray();
		 
		            char[] s2Array = s2.toLowerCase().toCharArray();
		 
		            //Sorting both character array
		 
		            Arrays.sort(s1Array);
		 
		            Arrays.sort(s2Array);
		 
		            //Check if both arrays are equal
		 
		            status = Arrays.equals(s1Array, s2Array);
		        }
		        
				if(status){
		            System.out.println(s1+" and "+s2+" are anagrams");
		        } else {
		            System.out.println(s1+" and "+s2+" are not anagrams");
		        }

		  }
			
		  
		  
		  
		  
		//The  numbers are anagram or not
		  public static boolean anagram(int n1,int n2)
		  {
			  int[] ncount1=count(n1);
			  int[] ncount2=count(n2);
			  for(int i=0;i < ncount2.length;i++)
			  {
				  if(ncount1[i]!=ncount2[i])
				  {
					  return false;
				  }
			  }
			return true;
			  
					  
		  }
		  
		  
	
		  
 // count the anragram numbers
		  
		  private static int[] count(int n){
			// TODO Auto-generated method stub
			  int[] count=new int[20];
			  int temp = n;
				while (temp != 0) {
					int r = temp % 10;
					count[r]++;
					temp = temp / 10;
				}
		return count;
			  
		  }
		  
		  
		  //the Prime Anagarm
		  public static void primeAnagram()
		  {
			  ArrayList<Integer> ar = new ArrayList<Integer>();
			  System.out.println();
			  boolean b;
			  for(int j=2;j<=1000;j++)
			  {
				  b=true;
				  for(int i=2;i < j/2;i++)
				  {
					  if(j%i==0)
					  {
						  b=false;
						  break;
					  }
				  }
				 
				  if(b)
			
					ar.add(j);
				  
					  
			  }
			  
			  for(int i=0;i<=ar.size();i++)
			  {
				  for(int j = i+1;j < ar.size();j++)
				  {
					  if(anagram(ar.get(i),ar.get(j)))
					  {
						  System.out.println("prime number"+ar.get(i)+"Anagram"+ar.get(j));
					  }
				  }
			  }
			  
			
		  }




		//display the number between 1 to 1000
		  public static void prime() {
			  System.out.println();
			  boolean b;
			  for(int j=2;j<=1000;j++)
			  {
				  b=true;
				  for(int i=2;i < j/2;i++)
				  {
					  if(j%i==0)
					  {
						  b=false;
						  break;
					  }
				  }
				 
				  if(b)
			
					  System.out.println(j + " ");
				  
					  
			  }
			  
			  
			  
		  }
		  
		 
		  
	
		  
		 
		 //Check the prime number between 1 to 1000
		  public static boolean isPrime(int n) {
				for (int i = 2; i < n / 2; i++) {
					if (i % n == 0) {
						return false;
					}
				}
				return true;
		}
		  
		  
		  
		  
		  public static void palindrome()
		  {
			  
			  System.out.println();
			  boolean b;
			  for(int j=2;j<=1000;j++)
			  {
				  b=true;
				  for(int i=2;i < j/2;i++)
				  {
					  if(j%i==0)
					  {
						  b=false;
						  break;
					  }
				  }
				 
				  if(b && isPalindrome(j))
			
					  System.out.println(j + " ");
				  
					  
			  }
			  
			  
		  }
		  
		  
		  //check the palindrome number 1 t0 1000
		  public static boolean isPalindrome(int num)
		    {
		        int rev=0,temp=num;
		        for (int i = 1; i <= num; i++)
		        {
		        while(temp!=0)
		        {
		            rev=rev*10+(temp%10);
		            temp=temp/10;
		        }
		        }
		        if(rev==num)
		            return true;
		        else
		            return false;
		    }

			
		  
		  //BubbleSort Elements
		  public static void BubbleSort(int arr[])
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
			  
		  }
		  
		  public static void printList(int arr[])
		  {
			  int num=arr.length;
			  
		     System.out.println("Sorted list of numbers:");
			  
			    for(int i=0;i<num;i++)
			    {
			    	 System.out.println(arr[i]);
			    }
			     
			  
		  }
       
//question java
		public int binarySearch(int low,int high) {
			
			// TODO Auto-generated method stub
			   if ((high - low) == 1)
			   {
				   return low;
			   }
          
		        int mid = low + (high - low) / 2;
		        
		        System.out.println("number is less than "+ mid +"press 1 to Yes or press 0 to No");
		        Scanner sc=new Scanner(System.in);
		        
		        int no=sc.nextInt();
		        if(no==1)
		        {
		        	return binarySearch(low,mid);
		        }
		        else
		        {
		        	return binarySearch(mid,high);
		        }
		        
		      
			
			
		}
		  

		  
		}
			
		



			

