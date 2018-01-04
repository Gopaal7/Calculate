package com.msn.atl.calculate;

public class Car {
	
	 private int seats = 4;
	public String engine="4cy";
	
	
	
	public void seats()
	{
		System.out.println("it has " + seats);
		
	}
	
	public int running()
	{
		System.out.println("From parent Car");
		return 7;
	}
	
	public int running(int num)
	{
		System.out.println("From parent Car" +"---" + num);
		return 7;
	}
	
	 String running(int num, String str)
	{
		System.out.println("From parent Car" + "--" +num +"--" + str);
		 return "AA";
	}
	
	
	 protected void doRun()
	 {
		 System.out.println("Do run from Parent");
	 }
	

}
