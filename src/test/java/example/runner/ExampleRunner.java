package example.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//Cucumber Options Contain Location for Feature files and Steps and More Configs
@CucumberOptions(
        //Location to Feature File / Feature Files.
        features = "classpath:examples/MyFirstTest.feature",
        //Location / Package name for Steps Definitions
        glue = "example.steps",
        plugin = "html:target/test_report/report.html"
)
public class ExampleRunner {
}
