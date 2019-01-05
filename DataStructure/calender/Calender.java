/**Created by:Rohini Patil
* Date 3/01/2019
* Purpose:Desc ­> :Takes the month and year as command­linearguments and prints the Calendar of
*  the month. Store the Calendar in an 2D Array,the first dimension the week of the month and 
*  the second dimension stores the day of the week.
 */

package all.program.data;

import all.program.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		CalenderMethod cal=new CalenderMethod ();
		
		System.out.println("Enter month between 1 to 12");
		String month=u.inputString();

	    
	    System.out.println("Enter Year");
	    int year=u.inputInteger();
	   // cal.leapYear(year);
	    
	    System.out.print("Enter the week day name (e.g. Sunday) of 1st day of "+month+" : ");
        String day = u.inputString();
	    
	    int max=cal.findMaxDay(month, year);
	    int f=cal.findDay(day);
	    cal.fillCalendar(max, f, month, year);
	    
		

	}

}
