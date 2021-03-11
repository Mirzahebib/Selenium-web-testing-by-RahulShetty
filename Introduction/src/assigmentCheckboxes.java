import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assigmentCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");	  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice//");
		  driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		  Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		  driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		  Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		  driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		  driver.close();
		  
		  
	}

}
