package rahulshettyacademy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	 ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		//ExtentReports , ExtendSparkReporter
		 String path = System.getProperty("user.dir")+"\\reports\\index.html";
		 ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		 reporter.config().setReportName("Web Automation Results");
		 reporter.config().setDocumentTitle("Test Results");
		 
		 
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "Mirza Hebib");
		 
	}
	@Test
	public void initialDemo()
	{
		
		 ExtentTest test = extent.createTest("Initial Demo");
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com");
		 System.out.println(driver.getTitle());
		 driver.close();
		 test.fail("result do not match");
		
		 extent.flush();

	}
	

}
