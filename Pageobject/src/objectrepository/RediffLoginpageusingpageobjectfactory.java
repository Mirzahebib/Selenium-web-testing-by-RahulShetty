package objectrepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpageusingpageobjectfactory {
	
	WebDriver driver;
	public RediffLoginpageusingpageobjectfactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * By username = By.id("login1"); By password = By.name("passwd"); By name =
	 * By.name("proceed");
	 */
	@FindBy(id = "login1")
	WebElement username;
	
	@FindBy(name = "passwd")
	WebElement password;
	
	@FindBy(id = "proceed")
	WebElement name;
	
	
	public WebElement EmailId()
	{
		return username;
	}
	
	public WebElement passwordId()
	{
		return password;
	}
	public WebElement submit()
	{
		return name;
	}
}
