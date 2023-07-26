package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="@target/report/failedScenarios.txt",
		glue= {"stepDefs"},
		monochrome=true,
		dryRun=false,
		plugin= {"pretty",
			//	"usage:target/report/usageReport",
			//	"html:target/report/HTMLReport.html",
			//	"json:target/report/JSONReport.json",
			//	"testng:target/report/TestngReport.xml",
			//	"rerun:target/report/filedScenarios.txt"}
				
				"com.aventstack.extentreports.cucumber.adaper.ExtentCucumberAdapter:"}
	
		)

public class Rerunner extends AbstractTestNGCucumberTests {

}
