

package locatorDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTakingScreenshot {
	
static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\repository\\BesantMavenArtifact\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void validateForms() throws InterruptedException, IOException
	{
	
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

	TakesScreenshot ts=(TakesScreenshot)driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("./Screenshots/image1.png"));

}


	@AfterTest
	public void closeApplication()
	{
		
		driver.close();
	}

}