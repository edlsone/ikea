package stepDefinition;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class) 
//Cucumber options:
// Path of our Feature file(s)
// Glue contains the package(s) where we have implemented our step definitions 
//@CucumberOptions (features="src/test/resources/Features", glue={"stepDefinition"} , publish = true)
//@CucumberOptions (features="src/test/resources/Features", glue={"stepDefinition"} , plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} , publish = true) 


@CucumberOptions(
	    features = "src/test/resources/Features",
	    glue = {"stepDefinition"},
	    plugin = {"pretty", 
	    		"html:target/cucumber-reports.html",
	    		"json:target/cucumber-report.json"
	    		},
	    publish = true
		)
/*
@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "your.step.definition.package",
	    plugin = {"json:target/cucumber-report.json"} // Specify the path for the JSON report
	)

*/

public class RunnerTest {

}
