package com.stepdefinition1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.locator.loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class adactinlogin extends loginpage {
	WebDriver driver;
	 loginpage page = new loginpage();
	@Given("user should be in adactin page")
	public void user_should_be_in_adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS );
	}
	@When("user should enter {string} , {string}")
	public void user_should_enter(String string, String string2) {
	   page.getTxtusername().sendKeys(string);
	   page.getTxtpass().sendKeys(string2);
	}


	

	
	@When("user should click login")
	public void user_should_click_login() {
		 page.getLogin().click();
		
	    
	}
	@Then("user need to validate error message")
	public void user_need_to_validate_error_message() {
	    
	}




}
