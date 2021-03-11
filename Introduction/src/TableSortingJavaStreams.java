import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSortingJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Before each test we need to design algorhytm how to achieve results
		// Get on column and it gets sorted
		// Capture or webelements into one list "original list"
		// Get text of each web element we will get actual text of webelements and put
		// into new list "original"
		// Perform sort on original list of step 3 and then created new "sorted list"
		// Compare original list vs sorted if both are equeal we can conclude that first
		// list
		// is in sorted order

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody//td[1]"));
		List<String> price;
		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originalList.equals(sortedList));

		// scan the name column wuth getText once we get to Rice print price of the Rice
		do
		{
		 List<WebElement> rows = driver.findElements(By.xpath("//tbody//td[1]"));
		 price = rows.stream().filter(s -> s.getText().contains("Chocolate"))
				.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1) 
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);

	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
	String pricevalue =	s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue ;
	}

}
