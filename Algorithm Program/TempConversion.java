package all.algo.program;

import all.program.utility.Utility;

public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		//accept the value of temperature in fahrenheit
		System.out.println("Enter the temperature in fahrenheit as input ");
		int fahrenheit=u.inputInteger();
		
		float cel=u.tempConverSion(fahrenheit);
		System.out.println("Temperature in Celsius  :" +cel);
		
		

	}

}
