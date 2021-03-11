package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void LoginWebCarLoan() {
		System.out.println("");
	}
	
		
	@Test(groups= {"Smoke"})
	public void LoginMobCarLoan1() { 
		System.out.println("MobCarLoan2");
	}
	
	@BeforeSuite
	public void Bfsuite() 
	{
		System.out.println("I am the number one");
	}
	
	@Test
	public void LoginAPICarLoan2() {
		System.out.println("MobCarLoan3");
	}
	
}
