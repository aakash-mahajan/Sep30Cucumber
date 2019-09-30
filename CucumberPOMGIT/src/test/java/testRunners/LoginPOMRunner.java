package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue= {"stepDefination"},
		plugin = {"json:target/cucumber-report/report.json"}
		)

public class LoginPOMRunner {

}
