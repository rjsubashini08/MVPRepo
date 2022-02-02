package demoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenGoogleApplChromeBrowser {

	static WebDriver driver;
@BeforeTest
public void launchChromeBrowser()
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\repository\\BesantMavenArtifact\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
}
  @Test
  public void openApplication() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.get("http://google.com");
	  Thread.sleep(3000);
	  
  }
  
  @AfterTest
  public void closeApplication() {
	  driver.close();
	  
  }
}
