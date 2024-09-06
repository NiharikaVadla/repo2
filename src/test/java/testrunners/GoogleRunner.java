package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = C:\Users\USER\eclipse-workspace\\CucumberFW\\src\\test\\resources\\Featuresfile\\A.feature,glue="stepdef")
@CucumberOptions(features="C:\\Users\\USER\\eclipse-workspace\\CucumberFW\\src\\test\\resources\\Featuresfile\\A.feature",glue="stepdef")
public class GoogleRunner {

}
