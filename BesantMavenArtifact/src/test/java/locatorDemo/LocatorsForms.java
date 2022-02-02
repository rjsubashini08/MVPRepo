package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsForms {

	static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\repository\\BesantMavenArtifact\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void validateForms() throws InterruptedException
	{
		driver.get("file:///C:/Users/Sony/Downloads/test.html");
		Thread.sleep(3000);
		
		//Find the elements using ID
		//Find
		//Locate
		//action
		
		WebElement textBoxEle=driver.findElement(By.id("uname"));
		textBoxEle.sendKeys("Pallavi");
		Thread.sleep(3000);
//		driver.findElement(By.id("username")).sendKeys("Pallavi");
		
		WebElement txtpswd=driver.findElement(By.name("password"));
		txtpswd.sendKeys("subashini");
		
		WebElement classObj=driver.findElement(By.className("xyz_gi"));
		classObj.sendKeys("subashini");
		
		WebElement ancObj=driver.findElement(By.linkText("User Login"));
		ancObj.click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		WebElement ancObjpar=driver.findElement(By.partialLinkText("User"));
		ancObjpar.click();
		
//		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
//		Thread.sleep(3000);
//		WebElement inbObj=driver.findElement(By.partialLinkText("Inbo"));
//		inbObj.click();
//		driver.findElement(By.xpath("//*[@id='identifierId']")).click();
		
		
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}
	
}
