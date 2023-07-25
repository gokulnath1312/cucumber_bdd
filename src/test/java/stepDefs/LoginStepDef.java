package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
		
		driver	= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/login");
	}
	@When("user enters login credentails")
	public void user_enters_login_credentails() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
		//input[@name='username']
		//input[@id='username']
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	}
	@Then("should display the home page")
	public void should_display_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  boolean  isValidUser=driver.findElement(By.id("flash-messages")).isDisplayed();
	  Assert.assertTrue(isValidUser);
	}
	

	

}
