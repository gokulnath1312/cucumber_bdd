package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TaggedStepDef {
	
	@BeforeAll
	public static void setUp() {
		System.out.println("Before All step");
	}
  @Before (value="@smokeTest", order=1)
  public void eachScenario() {
	  System.out.println("Before each scenario...");
  }
  @Before (value="@smokeTest", order=1)
  public void readproperty() {
	  System.out.println("Read property file method...");
  }
  
  
  @BeforeStep
  public void eachStep() {
	  System.out.println("Before each step");
  }
	@AfterStep
	public void aftereachStep() {
		System.out.println("After each Step");
	}
	
	@After
	public void after() {
		System.out.println("After........");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("After All step");
	}

	
	@Given("User is logged in")
	public void user_is_logged_in() {
	   System.out.println("User is logged in");
	}
	@When("User update a task")
	public void user_update_a_task() {
	   System.out.println("User update a task");
	}

	
	@When("User create a task")
	public void user_create_a_task() {
		 System.out.println("User Create a task");
	}
	
	@When("User update a contact")
	public void user_update_a_contact() {
	   System.out.println("User update a contact");
	}

	
	@When("User create a contact")
	public void user_create_a_contact() {
	   System.out.println("User create a contact");
	}

	@When("User create a Deal")
	public void user_create_a_deal() {
	  System.out.println("User create a deal");
	}

	@When("User delete a task.")
	public void user_delete_a_task() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("User delete a task");
	}
	

@When("User delete a contact")
public void user_delete_a_contact() {
    System.out.println("user delete a contact");
}

@When("User delete a Deal.")
public void user_delete_a_deal() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User delete a deal");
}
@When("User update a Deal")
public void user_update_a_deal() {
    System.out.println("User update a deal");
}
	
}
