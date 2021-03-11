package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver  driver;
	
	
	By emailField = By.id("user_email");
	
	By password = By.id("user_password");
	
	By login_btn = By.name("commit");
	
	By forgotPassword = By.className("link-below-button");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
	this.driver=driver;
	
	}

	public WebElement setEmail() 
	{
		return driver.findElement(emailField);
		
	}
	
	public WebElement setPassword() 
	{
		return driver.findElement(password);
		
	}
	public WebElement clickOnLogin() 
	{
		return driver.findElement(login_btn);
		
	}
	public WebElement forgotPassword() 
	{
		return driver.findElement(forgotPassword);
		
	}
	

}
