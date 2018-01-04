
package com.msn.atl.calculate;

public class InhertenceDemo extends Car {

	public static void main(String[] args)
	{
		InhertenceDemo in = new InhertenceDemo();
		//in.totalSeats();
		//in.seats();
		in.running();
		in.running(10);
		in.running(12, "Gopal");
		in.doRun();
		
	}
	
	
	 public void totalSeats()
	 {
		 seats();
		// System.out.println("Total seats from Parent" + seats);
	 }
	 
	 public void seats()
	 {
		 System.out.println("it is from child class");
	 }
	 
	 
	/* public int running()
	 {
		 System.out.println("it is from child");
		 return 12;
	 }*/
	
	 public void doTest()
	 {
		 doRun();
	 }
}

 
 