package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import resources.base;



public class HomePageTest extends base{
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
		
	
	@Test
	public void ThisisDemo() throws IOException 
	{
		HomePage hm = new HomePage(driver);
		String text = hm.getText().getText();
		/* Assert.assertEquals(text,"FEATURED COURSES" ); */
		Assert.assertEquals(hm.getText().getText(), "FEATURED COURSES");
		/* hm.getLogin().click(); */
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
