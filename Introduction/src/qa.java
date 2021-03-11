import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class qa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//SSL Certifikates
		
		//Desired capabilities
		//General chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Belongs to my local browser
		ChromeOptions c = new ChromeOptions();  //Object of local crome browser (given all options)
		c.merge(ch);
		System.setProperty("webdriver.crome.driver", "");
		WebDriver driver =new ChromeDriver(c);
		
		//We re telling to our chrome browser invoke chrome browser with options what object "c" have

	}

}
