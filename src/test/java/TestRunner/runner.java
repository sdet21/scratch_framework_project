package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/punee/IdeaProjects/scratch_project/src/test/resources/WebsiteLandings/capitalone.feature"
        ,glue= {"stepDefinitions"},
        format= {"pretty","html:test-output"}
)

public class runner {

}