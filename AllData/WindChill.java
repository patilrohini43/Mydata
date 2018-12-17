package all.program.com;

import all.program.utility.*;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
	System.out.println("Enter the temperature t (in Fahrenheit)");
	double temp=u.inputDouble();
	
	
	
	System.out.println("Enter he wind speed v (in miles per hour)");
	double speed=u.inputDouble();
	
	double windChill=35.74+0.6214 * temp + (0.4275 * temp -35.75) * Math.pow(speed,0.16);
	
	

	 
	 if(temp >=50 ||  speed >=120 || speed <=3)
		 
	 {
		 System.out.println("The formula is not valid" );
		 
	 }
	 else
	 {
		 System.out.println("The formula is valid" +windChill);
	 }
	
	 
	 
	}
	
	

	
}
