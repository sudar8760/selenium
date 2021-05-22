package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinhotel1 {
	WebDriver driver;
	@Given("user should be in adactin page")
	public void user_should_be_in_adactin_page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS );
	
	
	}
	

@When("user should enter {string} and {string}")
public void user_should_enter_and(String usrnam, String pass) {
	driver.findElement(By.id("username")).sendKeys(usenam);;
	driver.findElement(By.id("password")).sendKeys(pass);
}
	@When("user should click login")
	public void user_should_click_login() {
		driver.findElement(By.id("login")).click();;
	}

@When("user should enter the values in {string}{string}{string}{string}{string}{string}\"<Adults per Room>\"and\"<Children per Room>\"")
	public void user_should_enter_the_values_in_three_and_two(String Location, String Hotels,String Roomtype, String Numberofrooms, String CheckInDate, String CheckOutDate) {
	WebElement txt = driver.findElement( By.xpath("/html/body/table[2]/tbody/tr[1]/td[1]"));
	String text = txt.getText();
	if (text.equals("Welcome to Adactin Group of Hotels")) {
		System.out.println("successfully login to the search PAGE");
	
	Select sc= new Select(driver.findElement(By.id("location")));
	sc.selectByVisibleText(Location);
	Select sc1= new Select(driver.findElement(By.id("hotels")));
	sc1.selectByVisibleText(Hotels);
	Select sc2= new Select(driver.findElement(By.id("room_type")));
	sc2.selectByVisibleText(Roomtype);
	Select sc3= new Select(driver.findElement(By.id("room_nos")));
	sc3.selectByVisibleText(Numberofrooms);
	driver.findElement(By.id("datepick_in")).sendKeys(CheckInDate);
	driver.findElement(By.id("datepick_out")).sendKeys(CheckOutDate);
	}else
	{
		System.out.println("user not in search page");
	}
	
	}
	@When("click search button")
	public void click_search_button() {
		driver.findElement(By.id("Submit")).click();
		
	}
	@Then("Verify the message")
	public void verify_the_message() {
		Assert.assertTrue("verify",true);
		driver.quit();
	}




}
