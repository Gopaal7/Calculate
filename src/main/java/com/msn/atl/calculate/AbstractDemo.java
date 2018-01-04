package com.msn.atl.calculate;

public abstract class AbstractDemo {
	public abstract void myRun();
	
	public void getName()
	{
		System.out.println("it is regular method");
		
	}
	
	public void getNum()
	{
		System.out.println("it is get number method");
	}
	
	public static void getSales()
	{
		System.out.println("it is from getSales");
	}

}

  class FirstAA extends AbstractDemo
{

 	public void myRun() {
		System.out.println("it is from myRun");
	}
	
   public void getNum()
   {
	   System.out.println("it is from get number in the sub class");
	   AbstractDemo.getSales();
   }
   
   
   
	
}
  
  
  