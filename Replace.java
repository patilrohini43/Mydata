package all.program.com;

import java.util.Scanner;

public class Replace {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String You Want");
		String str=sc.nextLine();
		
		System.out.println("Enter search name character ");
		String search=sc.nextLine();
		
		System.out.println("Enter Replace name charatcter");
		String replace=sc.nextLine();
		
		String result=str.replace(search, replace);
		
		System.out.println("Result = " + result);
		
		sc.close();

	}

}
