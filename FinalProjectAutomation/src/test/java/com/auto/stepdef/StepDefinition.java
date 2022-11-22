package com.auto.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.auto.base.Base;
import com.auto.elements.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base {
	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);

	@Given("I open the browser and I go to the application")
	public void i_open_the_browser_and_i_go_to_the_application() {
	    
	    
	}

//	@When("I click on the sign in button located on the  homepage")
//	public void i_click_on_the_sign_in_button_located_on_the_homepage() {
//		pf.getLoginButton().click();
//	    
//	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) {
	    
	    pf.getusername().sendKeys(username);
	    pf.getPassword().sendKeys(password);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	   pf.getSingInButton().click(); 
	    
	}

	@Then("I am suppose to get an error message at the bottom")
	public void i_am_suppose_to_get_an_error_message_at_the_bottom() {
	    
		String expected = "Epic sadface: Username and password do not match any user in this service";
		String actual = driver.findElement(By.xpath("//*[@data-test='error']")).getText();
				Assert.assertEquals(actual, expected);
	}

}
