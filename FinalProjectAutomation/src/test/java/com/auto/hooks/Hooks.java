package com.auto.hooks;

import com.auto.base.Base;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

	
	//Initialize starts the browser before every scenario
	@Before
	public static void initialize() {
		Base.setUp();	
	}
	
	//tearDown will quit the browser after every scenario
	@After
	public static void tearDown() {
		driver.quit();
		
	}

}
