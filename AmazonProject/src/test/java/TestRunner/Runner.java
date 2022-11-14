package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"./src/test/java/pom/features"},
glue = {"StepDefinition","ApplicationNooks"},
plugin = {"pretty"}
)

public class Runner {
	

}
