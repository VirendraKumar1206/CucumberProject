package formRunner;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/Login/login.feature"}
,glue = "formdefinitions"
,plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumberjason.xml"}	
)




public class fornTestNg {

}
