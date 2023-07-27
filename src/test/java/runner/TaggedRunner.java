package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src\\test\\resources\\taggedFeature",
		glue= {"stepDefs"},
		monochrome=true,
		dryRun=true,
		//tags="@RegressionTest and @SmokeTest",
		//tags="@SmokeTest and not @RegressionTest",
		//tags="@FeatureDeal and @SmokeTest",
	//	tags="@FeatureDeal or @FeatureContact and @SmokeTest",
		tags = "@FeatureDeal",
		plugin= {"pretty",
			//	"usage:target/report/usageReport",
				"html:target/report/HTMLReport.html",
			//	"json:target/report/JSONReport.json",
			//	"testng:target/report/TestngReport.xml",
			//	"rerun:target/report/filedScenarios.txt"}
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	
		)


public class TaggedRunner extends AbstractTestNGCucumberTests {

}
