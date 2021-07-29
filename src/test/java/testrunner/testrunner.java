package testrunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Featurefile/kk.feature",
        glue="Stepdefinition",
        dryRun=false,
        monochrome=true,
        plugin= {"pretty","html:test-output/report.html"
        }
        

)
public class testrunner {
	

}
