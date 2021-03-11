import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeTestLocators {
	//static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
    	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("anytext");
		driver.findElement(By.cssSelector("#email")).sendKeys("cssselectors");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[3]/a")).click();
		//driver.findElement(By.id("email")).sendKeys("mirza");
	//	System.out.println(driver.findElement(By.id("email")));
		//driver.findElement(By.className("inputtext _55r1 _6luy"));
	//	System.out.println(driver.findElement(By.className("inputtext _55r1 _6luy")));
	//	driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("This is real test");
	//	driver.findElement(By.name("pass")).sendKeys("this is password");
	//	driver.findElement(By.linkText("Forgotten password?")).click();
		
        
    //	WebDriver driver = new FirefoxDriver();
    //	driver.get("https://www.facebook.com/");
	//	driver.findElement(By.id("email")).sendKeys("mirza");
	//	System.out.println(driver.findElement(By.id("email")));
		//driver.findElement(By.className("inputtext _55r1 _6luy"));
	//	System.out.println(driver.findElement(By.className("inputtext _55r1 _6luy")));
	//	driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("This is real test");
	//	driver.findElement(By.name("pass")).sendKeys("this is password");
	//	driver.findElement(By.linkText("Forgot Password?")).click();
		
		
		
		
		
		
		
        
        
        
        
	}

}


