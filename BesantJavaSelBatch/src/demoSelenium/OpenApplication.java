package demoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenApplication {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\repository\\BesantJavaSelBatch\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Sony\\git\\repository\\BesantJavaSelBatch\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();//Launch the Chrome Browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sony\\git\\repository\\BesantJavaSelBatch\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		
		Thread.sleep(3000);
		driver.manage().window().maximize();//Maximise the Browser
		Thread.sleep(3000);
		driver.get("http://google.com");//Open the Google Application
		Thread.sleep(3000);
		driver.close();
		

	}

}
