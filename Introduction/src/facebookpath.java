import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//tagName[attribute='value'] syntax for CSS costumize selector
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		//  driver.findElement(By.xpath("//*[@name='email']")).sendKeys("ttttst");
		//  driver.findElement(By.xpath("//*[@type='password']")).sendKeys("6265252");
		 // driver.findElement(By.xpath("//button[@name='login']")).click();
		  driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncustomizecss");
		  driver.findElement(By.cssSelector("input[type='password'")).sendKeys("7777777");
		  driver.findElement(By.cssSelector("button[type='submit'")).click();
	}

}
