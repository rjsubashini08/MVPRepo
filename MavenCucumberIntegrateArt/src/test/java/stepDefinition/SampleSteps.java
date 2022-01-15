package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleSteps {
	

@Given("This is my Given step")
public void this_is_my_Given_step() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("This is my Given step");
}

@When("this for some pre requisite condition")
public void this_for_some_pre_requisite_condition() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("this for some pre requisite condition");
}

@Then("login to the application")
public void login_to_the_application() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("login to the application");
}

@Then("Search the product")
public void search_the_product() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Search the product");
}

}
