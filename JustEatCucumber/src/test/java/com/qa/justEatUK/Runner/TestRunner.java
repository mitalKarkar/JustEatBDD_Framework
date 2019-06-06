package com.qa.justEatUK.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\mitta\\eclipse-workspace\\JustEatCucumber\\src\\main\\java\\com\\qa\\justEatUK\\feature\\just-eat.feature"
		,glue = {"com.qa.justEatUK.stepDefinations"}
		,format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
		monochrome = true, 
		strict = true, 
	    dryRun = false
	    )

public class TestRunner {

}
