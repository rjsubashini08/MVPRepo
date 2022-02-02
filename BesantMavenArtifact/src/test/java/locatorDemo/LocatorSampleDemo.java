package locatorDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorSampleDemo {
//	https://www.browserstack.com/users/sign_in
	static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\repository\\BesantMavenArtifact\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void validateForms() throws InterruptedException
	{
		driver.get("https://www.tutorialspoint.com/index.htm");
	      // wait of 5 seconds
	      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	      // findElement() will try to identify element till 5 secs
	      WebElement n=driver.findElement(By.id("gsc−i−id1"));
	      n.sendKeys("Java");
	      
	}
	
	
	@AfterTest
	public void closeApplication()
	{
		
		driver.close();
	}


}
