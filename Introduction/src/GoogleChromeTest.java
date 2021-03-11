import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		
		//Create Driver Object for Chrome Browser
		//We will strictly implement methods of webdriver
		//Class name = CromeDriver,
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());      //validate if your Page title is correct
		System.out.println(driver.getCurrentUrl()); //validate if you landed on current URL
		//System.out.println(driver.getPageSource()); //we will use this method with driver if we re not able to right click on the page this method will return page source
		driver.get("https://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		//driver.close(); //closes current browses
		//driver.quit(); //closes all the browsers opened by selenium script (mostly when we re dealing with child windows)
	
	}
	   
}
