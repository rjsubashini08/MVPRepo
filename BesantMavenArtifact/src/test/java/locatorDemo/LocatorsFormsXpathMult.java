package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsFormsXpathMult {

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
		
		WebElement textBoxEle=driver.findElement(By.xpath("//input[@type='submit' AND @name='btnLogin']"));
		textBoxEle.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
//		WebElement textBoxEle1=driver.findElement(By.xpath("//input[@type='submit' OR @name='btnReset']"));
//		textBoxEle1.click();
//		Thread.sleep(2000);
	}
	
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}
	
}
