package com.PageObjects.nc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver idriver;
	
	public LoginPage(WebDriver cdriver) {
		idriver=cdriver;
		PageFactory.initElements(cdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement un;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement lgnbtn;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement lgtbtn;
	
	public void setusername(String mailid) {
		un.clear();
		un.sendKeys(mailid);
	}
	public void setpassword(String Passwd) {
		pwd.clear();
		pwd.sendKeys(Passwd);
	}
	public void lgnclick() {
		lgnbtn.click();
	}
	public void lgtclick() {
		lgtbtn.click();
	}
}
