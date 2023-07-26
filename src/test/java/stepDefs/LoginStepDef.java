package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
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
	  driver.close();
	}
	
	@When("user enters login {string} and {string} credentails")
	public void user_enters_login_and_credentails(String userName, String userPwd) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(userName);
		//input[@name='username']
		//input[@id='username']
		driver.findElement(By.id("password")).sendKeys(userPwd);
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	}

	/*
	@When("user enters login  credentails")
	public void user_enters_login_credentails(DataTable dataTable) {
	    List<List<String>> users=dataTable.asLists();
	    String userName=users.get(0).get(0);
	    String userPwd=users.get(0).get(1);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(userName);
		//input[@name='username']
		//input[@id='username']
		driver.findElement(By.id("password")).sendKeys(userPwd);
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	}
*/
	
	@When("user enters login  credentails")
	public void user_enters_login_credentails(DataTable dataTable2) {
	    List<Map<String, String>> users=dataTable2.asMaps();
	   
	    	 String userName=users.get(0).get("username");
	 	    String userPwd=users.get(0).get("password");
	 	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(userName);
	 		//input[@name='username']
	 		//input[@id='username']
	 		driver.findElement(By.id("password")).sendKeys(userPwd);
	 		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();	
	    
	   
	}	
	
	

}
