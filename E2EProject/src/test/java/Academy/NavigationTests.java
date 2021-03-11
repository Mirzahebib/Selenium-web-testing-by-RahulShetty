package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import resources.base;

public class NavigationTests extends base{
	
	@BeforeTest
	
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void navigationBarPresent() throws IOException {
		
		HomePage hm = new HomePage(driver);
		boolean visible = hm.getNavBar().isDisplayed();
		Assert.assertTrue(visible);
		
		
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
