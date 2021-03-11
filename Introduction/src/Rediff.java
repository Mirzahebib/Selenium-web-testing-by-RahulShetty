import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rediff.com/");
		  driver.findElement(By.cssSelector("a[class*='signin'")).click();
		  driver.findElement(By.xpath("//input[contains(@id,'1')]")).sendKeys("testtesttest");
		  driver.findElement(By.cssSelector("input#password")).sendKeys("2344444333");
		  driver.findElement(By.xpath("//input[contains(@value,'Si')]")).click();
		
		
	}

}
