import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorScriptAssigmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement table = driver.findElement(By.cssSelector(".table-display"));

		//System.out.println(table.findElements(By.tagName("tr")).size());

		//System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		 int numberOfRows = driver.findElements(By.cssSelector(".table-display tr")).size();

		 System.out.println(numberOfRows);

		 int numberOfColumns = driver.findElements(By.cssSelector(".table-display th")).size();

		System.out.println(numberOfColumns);

		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());

	}

}
