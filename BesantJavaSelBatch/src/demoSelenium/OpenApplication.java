package demoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\BesantJavaSelBatch\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(3000);
		driver.manage().window().maximize();//Maximise the Browser
		Thread.sleep(3000);
		driver.get("http://google.com");//Open the Google Application
		Thread.sleep(3000);
		driver.close();
		

	}

}
