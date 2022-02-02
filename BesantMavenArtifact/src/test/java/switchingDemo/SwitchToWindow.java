package switchingDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchToWindow {
	
	static WebDriver driver;
	
	@BeforeTest
	public void launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\repository\\BesantMavenArtifact\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	
	@Test(priority=1)
	public void openApplication()
	{
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void demoSwitchToWindow()
	{
		driver.findElement(By.id("newWindowBtn")).click();
		String paratentwind=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		System.out.println(paratentwind);
		Set<String> allwindows=driver.getWindowHandles();
	Iterator<String> i1=allwindows.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
		String childWindow=i1.next();
		if(!paratentwind.equals(childWindow))
		{
			driver.switchTo().window(childWindow);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			driver.findElement(By.id("firstName")).sendKeys("Subashini");
			driver.findElement(By.id("lastName")).sendKeys("Subashini");
			driver.findElement(By.id("femalerb")).click();
			driver.findElement(By.id("englishchbx")).click();
			driver.findElement(By.id("email")).sendKeys("rjsubashini@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Hello");
			driver.findElement(By.id("registerbtn")).click();
			String msgVal=driver.findElement(By.xpath("//*[@id='msg']")).getText();
			System.out.println(msgVal);
			Assert.assertEquals(msgVal, "Registration is Successful");
			driver.close();
		}
		driver.switchTo().window(paratentwind);
		
	}
	}
	
	@AfterTest
	public void closeApp()
	{
	driver.close();
	}
	}

