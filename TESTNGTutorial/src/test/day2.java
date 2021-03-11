package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Test
	public void Web1() {
		System.out.println("WebCarLoan");
	}
	
	@AfterSuite
	public void Afsuite() 
	{
		System.out.println("I am the last one");
	}
	
	@Parameters({"URL"})
	@Test
	public void Web2(String urlname) { 
		System.out.println("WebHomeLoan");
		System.out.println(urlname);
	}
	
	@Test
	public void Web3() {
		System.out.println("WebFlatLoan");
	}
	
	/*
	 * @Parameters({"URL","ApiKey/username"})
	 * 
	 * @Test public void Web4(String urlname,String key) {
	 * System.out.println("WebSomethingLoan"); System.out.println(urlname);
	 * System.out.println(key); }
	 */
	
}
