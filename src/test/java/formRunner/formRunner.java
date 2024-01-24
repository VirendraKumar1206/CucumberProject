package formRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\form\\form.feature"}
,glue = "formDefinition")


public class formRunner extends AbstractTestNGCucumberTests{

}
