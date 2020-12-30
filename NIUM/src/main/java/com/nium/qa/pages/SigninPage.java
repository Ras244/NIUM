package com.nium.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nium.qa.Testbase.TestBase;



public class SigninPage extends TestBase {

	@FindBy(xpath = "(//ul[contains(@class,'sc-eJBYSJ eelkAS')]//li)[2]")
	WebElement signupbtn1;

	@FindBy(xpath = "//label[text()='Email Address']/following::input")
	WebElement Username;

	@FindBy(xpath = "//label[text()='Password']/following::input")
	WebElement password;

	@FindBy(xpath = "//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root')]//div[1]")
	WebElement countryyoustayfor;

	@FindBy(xpath = "//li[text()='Singapore']")
	WebElement countryname;

	@FindBy(xpath = "//div[@class='loginstyle__Checkbox-sc-1d7arxu-24 fdOWci']")
	WebElement checkbox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement signupbtn;

	@FindBy(xpath = "//div[@class='sc-giIncl dtnJOb']//a[1]")
	WebElement manualverification;


	public SigninPage() {
		PageFactory.initElements(driver, this);
	}

	public PersonalPage signin() throws Throwable {

		signupbtn1.click();
		Thread.sleep(3000);
		Username.sendKeys(prop.getProperty("emailaddress"));
		password.sendKeys(prop.getProperty("password1"));
		countryyoustayfor.click();
		countryname.click();
		checkbox.click();
		signupbtn.click();
		Thread.sleep(6000);
		manualverification.click();
		Thread.sleep(6000);
		return new PersonalPage();

	}

}
