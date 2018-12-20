package all.algo.program;

import all.program.utility.Utility;

public class VendingMachine {

	static int i=0;
	static int total=0;
	static int[] notes = { 1000,500,100,50,10,5,2,1};
	static int money;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u =new Utility();
		System.out.println("Enter The Amount:-");
		int money=u.inputInteger();
	     total +=u.cal(money, notes);
		System.out.println("Total Number of Notes is:-" + u.total);
		

	}

}
