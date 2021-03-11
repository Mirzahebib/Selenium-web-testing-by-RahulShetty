import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String text ="mirza hebib";
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.cssSelector("input[name*='enter-name']")).sendKeys(text);
		  driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
		  driver.switchTo().alert().getText();
		  System.out.println(driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		  driver.findElement(By.id("confirmbtn")).click();
		  System.out.println(driver.switchTo().alert().getText());
		  driver.switchTo().alert().dismiss();
		  
		
		
		
	}
}
