package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By signin = By.cssSelector("a[href='https://rahulshettyacademy.com/sign_in/']");

	By title = By.cssSelector("div[class='container'] div[class='text-center']");
	
	By nav_bar = By.cssSelector(".navbar-collapse>ul");

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(signin);

	}

	public WebElement getText() {
		return driver.findElement(title);

	}
	public WebElement getNavBar() {
		return driver.findElement(nav_bar);

}
}
