package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void Demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
		
	@Test(groups= {"Smoke"})
	public void SecondTest() { 
		System.out.println("bye");
	}
	
	@BeforeTest
	public void prerequisite() 
	{
		System.out.println("I will execute this first");
	}

	@AfterTest
	public void cleaning() 
	{
		System.out.println("I will execute last");
	}

}



