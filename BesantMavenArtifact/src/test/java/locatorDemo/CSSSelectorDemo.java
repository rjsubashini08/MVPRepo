package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSSSelectorDemo {

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
		driver.get("file:///C:/Users/Sony/Downloads/testCSS.html");
		Thread.sleep(3000);
		
		//Find the elements using ID
		//Find
		//Locate
		//action
		
		WebElement textBoxEle1=driver.findElement(By.cssSelector("input#uname"));
		textBoxEle1.sendKeys("Demo on ID with css Selector");
		
		WebElement textBoxEle2=driver.findElement(By.cssSelector("input.xyz"));
		textBoxEle2.sendKeys("Demo on Class with css Selector");
		
		
		WebElement textBoxEle4=driver.findElement(By.cssSelector("input[type='ajax_enabled'][style='mystyle']"));
		textBoxEle4.sendKeys("Demo on Multiple Attribute with css Selector");
		
		WebElement textBoxEle3=driver.findElement(By.cssSelector("input[type='submit']"));
//		textBoxEle3.sendKeys("Demo on Single Attribute with css Selector");
		textBoxEle3.click();
				
			
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}
	
}
