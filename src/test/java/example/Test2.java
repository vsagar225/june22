package example;

	
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	public class Test2 {
	  
		WebDriver driver;
		DesiredCapabilities caps=new DesiredCapabilities();
		
		
		@Test
	  public void f() throws MalformedURLException, InterruptedException {
		  System.err.println("Default Method");
		  driver=new RemoteWebDriver(new URL("https://127.0.0.1:4723/wd/hub"),caps);
		  driver.get("http://www.amazon.in");
		  Thread.sleep(1000);
		  driver.findElement(By.id("nav-search-keywords")).sendKeys("clothes");
		  		
		}
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test");
		  
		  caps.setCapability("devicename","RZ8M314YVYV");
		  caps.setCapability("platform", "Android");
		  caps.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
		  caps.setCapability(CapabilityType.VERSION, 10);
		  
	  }

	    @AfterTest
	  public void afterTest() {
		  System.out.println("After Test");
		  }

	}
