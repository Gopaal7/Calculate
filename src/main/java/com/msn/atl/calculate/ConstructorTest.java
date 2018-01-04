package com.msn.atl.calculate;

public class ConstructorTest {
	
	public static void main(String[] args)
	{
		
		
		System.out.println("It is con test");
		ConstructorTest contest = new ConstructorTest();
		//ConstructorTest contestp = new ConstructorTest("John");
		
		//ConstructorTest contestp1 = new ConstructorTest("John",123);
		
		System.out.println(contest.name);
		
	}
	
	String name;
	public ConstructorTest()
	{
		this.name="Gopal";
		System.out.println("it is default constructor");
	}
	
	public ConstructorTest(String name)
	{
		System.out.println("It is param constructor");
	}
	
	public ConstructorTest(String name, int num)
	{
		System.out.println("It is param constructor");
	}

}
