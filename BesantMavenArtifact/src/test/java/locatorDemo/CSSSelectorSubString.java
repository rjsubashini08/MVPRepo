package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSSSelectorSubString {

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
		driver.get("file:///C:/Users/Sony/Downloads/testCSSSubstring.html");
		Thread.sleep(3000);
		
		//Find the elements using ID
		//Find
		//Locate
		//action
		
//		<input type="text" id="empId_456"/>
		
		WebElement textBoxEle1=driver.findElement(By.cssSelector("input[id^='empId']"));
		textBoxEle1.sendKeys("Demo on ID with css Selector");
		
//		<input type="text" id="123_empId"/>
		WebElement textBoxEle2=driver.findElement(By.cssSelector("input[id$='empId']"));
		textBoxEle2.sendKeys("Demo on ID with css Selector");
		
//		<input type="text" id="123_empId_456"/>
		WebElement textBoxEle3=driver.findElement(By.cssSelector("input[id*='_empId_']"));
		textBoxEle3.sendKeys("Demo on ID with css Selector");
		Thread.sleep(3000);
//		<input type="text" id="123_empId_456"/>
//		WebElement textBoxEle4=driver.findElement(By.cssSelector("input:contains('empI')"));
//		textBoxEle4.sendKeys("Demo on ID with css Selector");
	
				
			
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}
	
}
