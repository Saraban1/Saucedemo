package com.auto.runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.auto.base.Base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"Features/saucedemoNegativeLogIn.feature"}, //feature file
		glue = {"com.auto.stepdef","com.auto.hooks"}, //glue packages with classname
		plugin = {"pretty","json:target/cucumber.json"}, 
		dryRun = false,
		monochrome = true //makes console readable 
		//tags = "@smoke"
			
		)

public class Runner  extends AbstractTestNGCucumberTests {

	
	@BeforeClass
	@Parameters("browserType")
	public static void beforeClass(@Optional("chrome") String browser)   {
		new Base();
		Base.initializeProperties();		
		Base.property.setProperty("BrowserType", browser);
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
}
