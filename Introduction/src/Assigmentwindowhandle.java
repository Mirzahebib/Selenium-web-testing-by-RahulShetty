import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmentwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		//Collecting windows and switching to child window
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parrentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.cssSelector(".example")).getText();
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		
		//Switch back to parrent window
		driver.switchTo().window(parrentId);
		String splitted = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(splitted);
		
		
		
	}

}
