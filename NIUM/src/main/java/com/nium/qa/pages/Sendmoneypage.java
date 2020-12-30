package com.nium.qa.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.nium.qa.Testbase.TestBase;


public class Sendmoneypage extends TestBase {

	@FindBy(xpath = "//img[@alt='Dropdown Pointer']")
	WebElement beni;
	
	@FindBy(xpath = "(//div[text()='Rashmi Dharmendra Gaikwad'])[2]")
	WebElement sendreciptname;

	// @FindBy(xpath = "//div[text()='Rohan Hj Jaini']")
	// WebElement namebeni;


	@FindBy(xpath = "(//img[@alt='Dropdown Pointer'])[2]")
	WebElement dropbank;

	@FindBy(xpath = "(//div[text()='PayNow'])[2]")
	WebElement paynow;

	@FindBy(xpath = "//input[@min='1000']")
	WebElement yousend;
	
	@FindBy(xpath = "//button[text()='Proceed to Payment']")
	WebElement procidbtn;

	

	public Sendmoneypage() {
		PageFactory.initElements(driver, this);
	}

	public Paymentmethodpage Bankdeposit() throws InterruptedException {
		beni.click();
		Thread.sleep(3000);

		boolean name = sendreciptname.isDisplayed();
		Assert.assertTrue(name); // 1

		String ActualSname = sendreciptname.getText();
		String ExpectedSname = prop.getProperty("Sname");
		Assert.assertEquals(ActualSname, ExpectedSname); // 2

		if (ActualSname.equalsIgnoreCase(ExpectedSname)) { // 3
			sendreciptname.click();
			System.out.println("successfully add recipet save");
		}
		// namebeni.click();
		Thread.sleep(3000);
		dropbank.click();
		Thread.sleep(3000);
		yousend.clear();
		yousend.sendKeys(prop.getProperty("sendvalue"));
		Thread.sleep(5000);
		procidbtn.click();
		System.out.println("user click on procced btn");

		return new Paymentmethodpage();
	}

}
