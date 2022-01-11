package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
//		features={"Features/Registration.feature","Features/Login.feature"},
		glue={"stepDefinition"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }

		)

public class TestRunner {

}
