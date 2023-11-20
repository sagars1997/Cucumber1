package Runner2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Users/sagars/eclipse-workspace/cucumber1/Login/login1.feature"}, glue = {"Definition2"}, plugin = {"html:report/myreport.html"}, tags = "@NegativeTesting")
public class Test_Runner2 {

}
