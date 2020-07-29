package bdd.runners;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resource/FeatureFiles" }, glue = { "bdd.stepDef",
	"bdd.utilities" }, tags = { "@regression" }, plugin = { "pretty", "html:target/cucumber-htmlreport",
			"json:target/cucumber-report.json",
			"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)

public class RunnerClass extends AbstractTestNGCucumberTests {

@AfterClass
public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File("config/config.xml"));

}
	
}
