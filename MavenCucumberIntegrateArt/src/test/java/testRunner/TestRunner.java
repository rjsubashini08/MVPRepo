package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue={"stepDefinition"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
		tags= {"@script"}
		)

public class TestRunner {

}
