package Academy;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.base;

public class LoginTests extends base {
	
	@BeforeTest
	    public void initialize() throws IOException 
	{
		driver=initializeDriver();
		
	}
	 
	@Test(dataProvider="getData")
	public void LoginValidCredentials(String username,String Password) throws IOException
	{
		driver.get(prop.getProperty("url"));
		HomePage hm = new HomePage(driver);
		hm.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.setEmail().sendKeys(username);
		lp.setPassword().sendKeys(Password);
		lp.clickOnLogin().click();
				
	}
	 
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "mirzhfhhdfhdfa.hebib@hotmail.com";
		data[0][1] = "12333344";
		data[1][0] = "teststsggdddds@hotmail.com";
		data[1][1] = "1233334sssssstt4";
		
		return data;
	}
	@AfterTest
	public void teardown() 
	{
		driver.close();
	}
	
	
}
