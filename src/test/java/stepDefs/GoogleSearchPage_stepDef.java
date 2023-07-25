package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchPage_stepDef {
	WebDriver driver;
	
	@Given("User launch the google page")
	public void user_launch_the_google_page() {
	driver	= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	    	}
	@When("User search for Java tutorial")
	public void user_search_for_java_tutorial() {
	WebElement searchBox=driver.findElement(By.name("q"));
	searchBox.sendKeys("Java Tutorial");
				
	   
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		Assert.assertEquals(driver.getTitle(), "Google");
		driver.close();
	   
	}
	
	
	@When("User search for Selenium tutorial")
	public void user_search_for_selenium_tutorial() {
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium Tutorial");
	}
	@Then("Should display Selnium result page")
	public void should_display_selnium_result_page() {
		Assert.assertEquals(driver.getTitle(), "Google");
		driver.close();
	}
}
