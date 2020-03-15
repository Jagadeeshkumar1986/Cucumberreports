package org.sam;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources",glue="test.sam",monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	 @DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
	