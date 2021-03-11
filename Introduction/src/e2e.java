import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");	  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
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
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.xpath("//a[@value='DEL']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		  driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		  driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).click();
		  
		  Thread.sleep(2000);
		  WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		  Select dropdown = new Select(staticDropdown);
		  dropdown.selectByVisibleText("USD");
		  driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(2000);
		  for (int i=1;i<5;i++) {
			  
			  driver.findElement(By.id("hrefIncAdt")).click();
			
		  
		  }
		  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		  driver.findElement(By.id("btnclosepaxoption")).click();
		  driver.findElement(By.cssSelector("input#ctl00_mainContent_btn_FindFlights")).click();
		  		 
	}

}
