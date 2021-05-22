package com.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage{
	WebDriver driver;

	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="username")
	 private WebElement txtusername;
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(name = "login")
	private WebElement login;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
}
