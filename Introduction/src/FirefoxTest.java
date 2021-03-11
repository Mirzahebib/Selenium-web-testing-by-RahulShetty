import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
	//Create Driver Object for Firefox Browser
			//We will strictly implement methods of webdriver
			//Class name = CromeDriver,
			
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://facebook.com");
			System.out.println(driver.getTitle());
			
		}
}
