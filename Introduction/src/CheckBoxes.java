import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		// Assert.assertFalse(false);System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000L);

		for (int i = 1; i < 5; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.close();
	}

}
