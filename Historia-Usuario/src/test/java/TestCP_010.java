import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:CP/CP_010.feature", plugin="html:target/test-report")
public class TestCP_010 {
 
}
