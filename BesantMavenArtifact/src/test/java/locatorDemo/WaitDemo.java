package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WaitDemo {
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
		String titlePagehome=driver.getTitle();
		System.out.println("Title of the page is "+titlePagehome);
		WebElement UserNameele=driver.findElement(By.id("user_email_login"));
		UserNameele.sendKeys("username1@xyz.com");
		WebElement Passwordele=driver.findElement(By.id("user_password"));
		Passwordele.sendKeys("Password1");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.name("commit")));
		WebElement submitBtn=driver.findElement(By.xpath("//*[@id='user_submit']"));
		submitBtn.click();
		Thread.sleep(3000);
		String titlePage=driver.getTitle();
		System.out.println("Title of the page is "+titlePage);
		Assert.assertEquals(titlePage, "Confirmation");
	}
	
	
	@AfterTest
	public void closeApplication()
	{
		
		driver.close();
	}


}
