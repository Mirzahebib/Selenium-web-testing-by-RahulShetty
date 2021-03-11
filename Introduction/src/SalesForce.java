import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/"); 
       // driver.findElement(By.name("username")).sendKeys("testforsales");
      //  driver.findElement(By.id("password")).sendKeys("123456");
       // driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		 //	WebDriver driver = new FirefoxDriver();
	    //	driver.get("https://login.salesforce.com/");
	    //	driver.findElement(By.id("username")).sendKeys("testtest");
	    //	driver.findElement(By.id("password")).sendKeys("87655522");
	    //	driver.findElement(By.id("Login")).click();
	    //    System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
	}

}
