package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/featurefile"},
        glue = {"stepdefininiton","hooks"},
        tags = "@lmti04",
        plugin = {"pretty",
                  "html:target/testoutput/Report.html",
                  "json:target/testoutput/Report.json",
                  "junit:target/testoutput/Report.xml"}

)

public class FeatureRunner {

}
