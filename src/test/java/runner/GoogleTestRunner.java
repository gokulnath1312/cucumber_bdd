package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src\\test\\resources\\feature\\",
		glue= {"stepDefs"},
		monochrome=true,
		plugin= {"pretty"}
	
		)


public class GoogleTestRunner extends AbstractTestNGCucumberTests {

}
