import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssigmentExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();

		// Declaring explicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		driver.findElement(By.xpath("//div[@id='results']")).getText();
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());

	}

}
