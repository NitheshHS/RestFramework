package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_Steps {
	@Given("^this is first step$")
	public void this_is_first_step() throws Throwable {
	    System.out.println("This is first step");
	}

	@When("^this is second step$")
	public void this_is_second_step() throws Throwable {
	    System.out.println("This is second step");
	}

	@Then("^this is third step$")
	public void this_is_third_step() throws Throwable {
	    System.out.println("This is third step");
	}

}
