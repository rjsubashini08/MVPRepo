package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
WebDriver driver;	
	@Given("user navigate to browser page")
	public void user_navigate_to_gmail_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hello I am in Navigate page to GMail");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\PracticeDemo\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		Thread.sleep(5000);
		System.out.println("Browser launched");
		driver.get("https://example.testproject.io/web/");
	    
	}

	@When("user pass the valid username and password")
	public void user_pass_the_valid_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user pass the valid username and password");
	    Thread.sleep(5000);
	    WebElement username=driver.findElement(By.xpath("//input[@id='name']"));
	    Thread.sleep(2000);
	    WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	    Thread.sleep(2000);
	    WebElement login=driver.findElement(By.id("login"));
	    Thread.sleep(2000);
	    username.sendKeys("Raghav");
	    password.sendKeys("12345");
	    login.click();
	}
	
	@When("user pass the invalid username and password")
	public void user_pass_the_invalid_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user pass the invalid username and password");
	    Thread.sleep(5000);
	    WebElement username=driver.findElement(By.xpath("//input[@id='name']"));
	    Thread.sleep(2000);
	    WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	    Thread.sleep(2000);
	    WebElement login=driver.findElement(By.id("login"));
	    Thread.sleep(2000);
	    username.sendKeys("Raghav1234");
	    password.sendKeys("12344565");
	    login.click();
	}

	@Then("Succesfully login to browser application")
	public void succesfully_login_to_gmail_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Succesfully login to gmail application");
	    driver.findElement(By.xpath("//p[@id='greetings']")).isDisplayed();
	}
	
	@Then("UnSuccesfully login to browser application")
	public void Unsuccesfully_login_to_gmail_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("UnSuccesfully login to gmail application");
	    driver.findElement(By.xpath("//p[@id='greetings']")).isDisplayed();
	}

}
