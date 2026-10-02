package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/home.feature",
glue={"stepdefinitions","hooks"},
plugin = {"pretty","html:target/cucumber-report.html"},
monochrome=true)
public class HomeRunner extends AbstractTestNGCucumberTests{
	
	
}
