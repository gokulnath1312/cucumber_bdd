package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src\\test\\resources\\feature\\",
		glue= {"stepDefs"},
		monochrome=true,
		dryRun=false,
		plugin= {"pretty",
				"usage:target/report/usageReport"}
	
		)


public class GoogleTestRunner extends AbstractTestNGCucumberTests {

}
