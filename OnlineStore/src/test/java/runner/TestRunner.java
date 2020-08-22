package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources",glue= {"stepDefinition","hooks"},plugin= {"pretty"}, monochrome=true)

public class TestRunner {


}
