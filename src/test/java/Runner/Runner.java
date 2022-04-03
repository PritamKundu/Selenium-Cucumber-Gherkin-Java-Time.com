package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/Features"},
        glue = {"src.test.java.StepDefinitions"},
        plugin = {"html:target/cucumber.html", "pretty"},
        dryRun = false,
        monochrome = true
)
public class Runner {

}
