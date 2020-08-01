package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
( 		features="features/",
		glue = { "stepDefs" },	
		tags="",
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json"},
				
		dryRun=false

		)
public class RunTest {

}