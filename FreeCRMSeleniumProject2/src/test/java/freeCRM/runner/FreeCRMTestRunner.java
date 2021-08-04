package freeCRM.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class FreeCRMTestRunner {
	@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
			"json:target/cucumber-jsonreports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = {
					"src/test/resources/FeatureFiles" }, glue = {
							"freeCRMStepDef" }, tags = {"@Sanity or @Regression"} , monochrome = true)

	public class RunCukesTest extends AbstractTestNGCucumberTests {

	}
}
