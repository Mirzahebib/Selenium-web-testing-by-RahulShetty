import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmentricky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com");
		
		//2
		driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		//3
		WebElement dropdown = driver.findElement(By.cssSelector("#dropdown-class-example"));
		dropdown.sendKeys(opt);
		
		//4
		WebElement field = driver.findElement(By.id("name"));
		field.sendKeys(opt);
		
		//5 
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		if(alert.contains(opt)) 
			
			{
				System.out.println("Alert message success");
			}
			else
				System.out.println("Something wrong with execution");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
