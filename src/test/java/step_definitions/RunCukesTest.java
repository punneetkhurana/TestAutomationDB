package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
* The RunCukesTest class implements a functionality to run features as
* Junit test case.
* @author  Puneet Khurana
* @version 1.0
* @since   2016-10-01 
*/

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {}
		)
public class RunCukesTest{
	
}