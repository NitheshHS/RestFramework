package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background_Steps {
	@Given("^I navigate to login page$")
	public void i_navigate_to_login_page() throws Throwable {
	    System.out.println("Iam at the login page");
	}

	@When("^I submit user name and password$")
	public void i_submit_user_name_and_password() throws Throwable {
	    System.out.println("I submit my username and password");
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
	    System.out.println("Iam logged to the website");
	}

	@Given("^User search for Lenovo Laptop$")
	public void user_search_for_Lenovo_Laptop() throws Throwable {
	    System.out.println("user searched for lenovo laptop");
	}

	@When("^Add the first laptop that appears in the seqarch result to the basket$")
	public void add_the_first_laptop_that_appears_in_the_seqarch_result_to_the_basket() throws Throwable {
	    System.out.println("First search result added to bag");
	}

	@Then("^User basket should display with added item$")
	public void user_basket_should_display_with_added_item() throws Throwable {
	    System.out.println("Bag is now contain added product");
	}

	@Given("^User navigate for lenovo laptop$")
	public void user_navigate_for_lenovo_laptop() throws Throwable {
	    System.out.println("user navigate for lenovo laptop");
	}

	@When("^Add the laptop to the basket$")
	public void add_the_laptop_to_the_basket() throws Throwable {
	    System.out.println("laptop added to bag");
	}

	@Then("^User basket should display with add item$")
	public void user_basket_should_display_with_add_item() throws Throwable {
	    System.out.println("bag is now added with laptop");
	}
}
