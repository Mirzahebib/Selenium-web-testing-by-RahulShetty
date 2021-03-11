package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffLoginpage;



public class Loginapplication {
	
	@Test 
    public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.EmailId().sendKeys("hello");
		rd.passwordId().sendKeys("1234");
		rd.submit().click();
		
		
		
		
	}
	
}
