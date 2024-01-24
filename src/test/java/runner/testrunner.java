package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\login\\login.feature"} 
, glue = "stepefinitions")

public class testrunner extends AbstractTestNGCucumberTests {

}
