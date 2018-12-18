package all.algo.program;

import java.util.Arrays;

import all.program.utility.Utility;
public class Anagrams {

	
	
	public static void main(String[] args) {
		
		Utility u=new Utility();
		System.out.println("Enter the first String");
		String str1=u.inputString();
		
		System.out.println("Enter the first String");
		String str2=u.inputString();
		u.isAnagram(str1, str2);
		
		System.out.println("the 1 to 1000 between Prime Number ");
		u.prime();
		System.out.println("the 1 to 1000 between Prime palindrome number ");
       u.palindrome();
       System.out.println("The numbers are Prime and Anargram");
       u.primeAnagram();
       
		
	}

}
