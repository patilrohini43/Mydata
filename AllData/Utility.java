package all.program.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {
	
		BufferedReader br;
		
	  public Utility()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
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

	public Double inputDouble() {
		// TODO Auto-generated method stub
		try{
			try{	
				return Double.parseDouble(br.readLine());
			}
			catch(NumberFormatException n){
				System.out.println(n.getMessage());	
			}
		}catch(IOException io){
			System.out.println(io.getMessage());
		}
        return (double) 0;
		
	
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

	
}
