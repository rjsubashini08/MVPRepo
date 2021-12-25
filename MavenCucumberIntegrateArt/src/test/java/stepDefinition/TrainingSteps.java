package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrainingSteps {

@Given("Welcome to MVP")
public void welcome_to_MVP() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Welcome to MVP"); 
}

@When("Gretting trainined in MVP")
public void gretting_trainined_in_MVP() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Gretting trainined in MVP");
}

@Then("Successfully placed in MNC")
public void successfully_placed_in_MNC() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Successfully placed in MNC");
   
}
}
