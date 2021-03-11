import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Page URL: qaclickacademy.com/practice
		
		//1.Give me the count of links on this page
		 //a usually tag for links
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com");
		driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.Get number of the links inside footer section
		//System.out.println(driver.findElement(By.cssSelector("#gf-BIG")).findElements(By.tagName("a")).size());
	
		WebElement footerdriver = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3 Find all links in first column in footer
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table//tbody//tr/td[1]/ul"));	
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4 Click on each link in the column and check that page are opening (links are dynamic)
		
		for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		
		}//opens all the tabs
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
		
			while(it.hasNext())
			{
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
			}
			
		}	
		
		
		
		
		
	
	}   
	


