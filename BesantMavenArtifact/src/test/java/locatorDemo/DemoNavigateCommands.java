package locatorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoNavigateCommands {
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
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.nopcommerce.com/orderdetails/1031");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();	}
	
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}


}
