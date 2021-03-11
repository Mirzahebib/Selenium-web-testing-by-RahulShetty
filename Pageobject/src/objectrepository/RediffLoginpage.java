package objectrepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	
	WebDriver driver;
	public RediffLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username = By.id("login1");
	By password = By.name("passwd");
	By name		= By.name("proceed");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement passwordId()
	{
		return driver.findElement(password);
	}
	public WebElement submit()
	{
		return driver.findElement(name);
	}
}
