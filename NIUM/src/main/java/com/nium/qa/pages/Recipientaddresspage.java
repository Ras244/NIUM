package com.nium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nium.qa.Testbase.TestBase;



public class Recipientaddresspage extends TestBase {

	@FindBy(xpath = "//div[@class=' css-1wy0on6']//div[1]")
	WebElement Recepientrecieveoption;

	@FindBy(xpath = "//div[text()='Bank Deposit']")
	WebElement Bankdeposit;
	
	@FindBy(xpath = "(//img[@alt='Dropdown Pointer'])[2]")
	WebElement Banknamedrop;

	@FindBy(xpath = "//div[text()='Land Bank']/following-sibling::div")
	WebElement Bankname;
	
	@FindBy(xpath = "(//img[@alt='Dropdown Pointer'])[3]")
	WebElement Swift;

	@FindBy(xpath = "//div[text()='CPHIPHMM']")
	WebElement Swiftcode;
	
	@FindBy(xpath = "//input[@label='Bank Account Number']")
	WebElement accno;
	
	@FindBy(xpath = "//input[@label='Address Line 1']")
	WebElement addressline1;

	@FindBy(xpath = "//input[@label='Address Line 2']")
	WebElement addressline2;

	@FindBy(xpath = "//input[@label='City']")
	WebElement city;

	@FindBy(xpath = "//input[@label='State']")
	WebElement state;

	@FindBy(xpath = "//input[@label='Postal Code']")
	WebElement postalcode;

	@FindBy(xpath = "//a[@class='nav-link']")
	WebElement Sendmoney;

	public Recipientaddresspage() {
		PageFactory.initElements(driver, this);
	}

	public Sendmoneypage ResidentailAddress() throws InterruptedException {
		Thread.sleep(5000);
		Recepientrecieveoption.click();
		Bankdeposit.click();
		Banknamedrop.click();
		Bankname.click();
		Swift.click();
		Swiftcode.click();
		accno.sendKeys(prop.getProperty("accno1"));
		addressline1.sendKeys(prop.getProperty("address1"));
		addressline2.sendKeys(prop.getProperty("address2"));
		city.sendKeys(prop.getProperty("city1"));
		state.sendKeys(prop.getProperty("state1"));
		postalcode.sendKeys(prop.getProperty("postalcode1"));
		Sendmoney.click();
		Thread.sleep(5000);
		return new Sendmoneypage();
	}
}
