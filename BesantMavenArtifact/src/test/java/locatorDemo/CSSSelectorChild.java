package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSSSelectorChild {

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
		driver.get("file:///C:/Users/Sony/Downloads/testCSSChild.html");
		Thread.sleep(3000);
		
		//Find the elements using ID
		//Find
		//Locate
		//action
		
//		<li>Apple</li>
		
		WebElement textBoxEle1=driver.findElement(By.cssSelector("ul#fruit li:first-of-type"));
		textBoxEle1.isDisplayed();
		System.out.println(textBoxEle1.getText());
//		<li>Orange</li>
		WebElement textBoxEle2=driver.findElement(By.cssSelector("ul#fruit li:nth-of-type(2)"));
		textBoxEle2.isDisplayed();
		System.out.println(textBoxEle2.getText());
//		<li>Banana</li>
		WebElement textBoxEle3=driver.findElement(By.cssSelector("ul#fruit li:last-child"));
		textBoxEle3.isDisplayed();
		System.out.println(textBoxEle3.getText());
				
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}
	
}
