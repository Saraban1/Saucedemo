package com.auto.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.base.Base;

public class ElementPage extends Base {

	
	public ElementPage(){
		PageFactory.initElements(driver, this);	
	}
	
//	@FindBy(xpath = "//*[@class='submit-button btn_action']")
//	private WebElement loginButton;
//
//	public WebElement getLoginButton() {
//		return loginButton;
//	}
	
	@FindBy(xpath="//*[@data-test='username']")
	private WebElement  username;

	public WebElement getusername() {
		return username;
	}
	
	@FindBy(xpath="//*[@data-test='password']")
	private WebElement  password;

	public WebElement getPassword() {
		return password;
	}
	
	
	@FindBy(xpath="//*[@data-test='login-button']")
	private WebElement  SingInButton;

	public WebElement getSingInButton() {
		return SingInButton;
	}

	
	
}
