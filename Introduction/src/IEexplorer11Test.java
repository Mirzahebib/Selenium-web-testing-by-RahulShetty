import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEexplorer11Test {

	public static void main(String[] args) {
	//Create Driver Object for Firefox Browser
			//We will strictly implement methods of webdriver
			//Class name = CromeDriver,
			
	System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Selenium\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://facebook.com");
			System.out.println(driver.getTitle());
			
		}
}
