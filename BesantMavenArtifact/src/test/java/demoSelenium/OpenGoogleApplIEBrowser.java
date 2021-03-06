package demoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenGoogleApplIEBrowser {

	static WebDriver driver;
@BeforeTest
public void launchChromeBrowser()
{
	
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Sony\\git\\repository\\BesantMavenArtifact\\src\\test\\resources\\Drivers\\IEDriverServer.exe");
	
	driver=new InternetExplorerDriver();	
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
