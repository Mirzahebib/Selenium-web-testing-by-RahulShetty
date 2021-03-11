import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesAssig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		//Switching to Iframe
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		driver.findElement(By.id("content")).getText();
		System.out.println(driver.findElement(By.id("content")).getText());
		
		

	}

}
