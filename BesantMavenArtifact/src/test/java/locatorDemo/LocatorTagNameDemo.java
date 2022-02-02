package locatorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorTagNameDemo {
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
		driver.get("https://accounts.lambdatest.com/login");
		List<WebElement> listtag=driver.findElements(By.tagName("input"));
		int listtagsize=listtag.size();
		System.out.println(listtagsize);
		for(int i=0;i<listtagsize;i++)
		{
		System.out.println("List of Tags"+listtag.get(i));
		}
		
		
		
		List<WebElement> listtagimg=driver.findElements(By.tagName("img"));
		int listtagsizeimg=listtagimg.size();
		System.out.println(listtagsizeimg);
		for(int i=0;i<listtagsizeimg;i++)
		{
		System.out.println("List of Tags"+listtagimg.get(i));
		}
	
		
		
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void closeApplication()
	{
		driver.close();
	}

}
