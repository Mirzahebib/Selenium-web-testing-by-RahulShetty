import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingUIElementsDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");	  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		 // Assert.assertFalse(false);System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		  driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
		
		  System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		  Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		  
		  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		  if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		  {
			  System.out.println("It is enabled");
			  		 Assert.assertTrue(true);
		  }
		  else {
			  System.out.println("It is not enabled");
			  Assert.assertTrue(false);
		  }
			  
}
	
	
}
