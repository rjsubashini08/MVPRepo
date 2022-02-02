package demoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GeneralOpenBrowser {
	
	static WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	
	public void launchChromeBrowser(String browser)
	{
		
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\repository\\BesantMavenArtifact\\src\\test\\resources\\Drivers\\chromedriver.exe");
			
			driver= new ChromeDriver();	
			
		}
		else if (browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Sony\\git\\repository\\BesantMavenArtifact\\src\\test\\resources\\Drivers\\IEDriverServer.exe");
			
			driver= new InternetExplorerDriver();	
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sony\\git\\repository\\BesantMavenArtifact\\src\\test\\resources\\Drivers\\geckodriver.exe");
			
			driver= new FirefoxDriver();		
		}
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
