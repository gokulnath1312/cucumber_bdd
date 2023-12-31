package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src\\test\\resources\\feature\\SendEmail.feature",
		glue= {"stepDefs"},
		monochrome=true,
		dryRun=false,
	//	tags = "tag2",
		plugin= {"pretty",
			//	"usage:target/report/usageReport",
				"html:target/report/HTMLReport.html",
			//	"json:target/report/JSONReport.json",
			//	"testng:target/report/TestngReport.xml",
			//	"rerun:target/report/filedScenarios.txt"}
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	
		)


public class GoogleTestRunner extends AbstractTestNGCucumberTests {

}
