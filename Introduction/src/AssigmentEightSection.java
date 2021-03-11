import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AssigmentEightSection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://cleartrip.com/");

		// Scroll down page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");

		// Selecting static drop downs
		WebElement adults = driver.findElement(By.xpath("//*[@name='adults']"));
		Select dropdown = new Select(adults);
		dropdown.selectByVisibleText("5");
		WebElement children = driver.findElement(By.id("Childrens"));
		Select dropdown2 = new Select(children);
		dropdown2.selectByVisibleText("2");

		// Selecting calendar icon and current date

		driver.findElement(By.cssSelector("input[id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();

		// Open Link and entering name on airline field
		driver.findElement(By.cssSelector("div#MoreOptionsDiv")).click();
		driver.findElement(By.cssSelector("input[name*='airline']")).sendKeys("indigo");

		// Click on search button
		driver.findElement(By.cssSelector("input[id*='SearchBtn']")).click();

		// Catch error message text
		driver.findElement(By.cssSelector("div[id*='homeErrorMessage']")).getText();
		System.out.println(driver.findElement(By.cssSelector("div[id*='homeErrorMessage']")).getText());

	}

}
