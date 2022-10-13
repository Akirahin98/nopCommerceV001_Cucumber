package com.StepDefination.nc;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjects.nc.LoginPage;

import io.cucumber.java.en.*;

public class Steps {
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User lunch chrome browser")
	public void user_lunch_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver", "./DriverNC/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    lp=new LoginPage(driver);
	}

	@When("User enter the URL as {string}")
	public void user_enter_the_url_as(String url) {
		driver.get(url);
	}

	@When("User enter the username as {string} and password as {string}")
	public void user_enter_the_username_as_and_password_as(String UN, String PWD) {
		System.out.println(UN);
	   lp.setusername(UN);
	   lp.setpassword(PWD);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	    lp.lgnclick();
	}

	@Then("Verify the Page title should be {string}")
	public void verify_the_page_title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() {
	  lp.lgtclick();
	}

	@Then("Close the browser")
	public void close_the_browser() {
	   driver.close();
	}
}
