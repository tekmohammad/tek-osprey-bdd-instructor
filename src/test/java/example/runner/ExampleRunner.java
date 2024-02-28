package example.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//Cucumber Options Contain Location for Feature files and Steps and More Configs
@CucumberOptions(
        //Location to Feature File specify the folder only to execute all the features
        features = "classpath:examples",
        //Location / Package name for Steps Definitions
        glue = "example.steps",
        //Dry Run Option if (true) is to scan Features and StepDefs for Unimplemented methods/steps
        //if dryRun is true cucumber WILL NOT execute the test just scanning
        dryRun = false,
        plugin = "html:target/test_report/report.html"
)
public class ExampleRunner {
}
